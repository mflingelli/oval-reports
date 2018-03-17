package de.flingelli.security.oval.reports;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "oval_results")
public class OvalResults {
    @XmlElement
    private Generator generator;
    @XmlElement
    private Directives directives;
    @XmlElement(name = "oval_definitions", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private OvalDefinitions ovalDefinitions;
    @XmlElement
    private Results results;

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public Directives getDirectives() {
        return directives;
    }

    public void setDirectives(Directives directives) {
        this.directives = directives;
    }

    public OvalDefinitions getOvalDefinitions() {
        return ovalDefinitions;
    }

    public void setOvalDefinitions(OvalDefinitions ovalDefinitions) {
        this.ovalDefinitions = ovalDefinitions;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    public void writeXml(String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(OvalResults.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(this, new File(fileName));
    }

    public void readXML(String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(OvalResults.class);
        Unmarshaller um = context.createUnmarshaller();
        OvalResults results = (OvalResults) um.unmarshal(new File(fileName));
        setGenerator(results.getGenerator());
        setDirectives(results.getDirectives());
        setOvalDefinitions(results.getOvalDefinitions());
        setResults(results.getResults());
    }

    public List<Definition> getDefinitionsOfFailedTests() {
        List<Test> tests = getResults().getSystem().getTests();
        Set<String> ids = new HashSet<>();
        tests.stream().filter(test -> !"oval:org.debian.oval:tst:1".equals(test.getTestId()) &&
                test.getTestedItem() != null &&
                test.getTestedItem().isResult()).forEach(test -> ids.add(test.getTestId()));
        List<Definition> result = new ArrayList<>(ids.size());
        ids.forEach(testRef -> {
            String id = getResults().getSystem().getDefinitionIdByTestReference(testRef);
            result.add(getOvalDefinitions().getDefinitionById(id));
        });
        return result;
    }

    public List<Definition> getDefinitionsOfPassedTests() {
        List<Definition> failedDefinitions = getDefinitionsOfFailedTests();
        List<Definition> definitions = getOvalDefinitions().getDefinitions();
        List<Definition> result = new ArrayList<>(definitions);
        failedDefinitions.forEach(result::remove);
        return result;
    }

    public List<Definition> getDefinitionsOfFixedTests(String fileName) throws JAXBException {
        OvalResults ovalResults = new OvalResults();
        ovalResults.readXML(fileName);
        List<Definition> failedDefintions = getDefinitionsOfFailedTests();
        List<Definition> passedDefinitions = ovalResults.getDefinitionsOfPassedTests();
        List<Definition> result = new ArrayList<>(failedDefintions.size());
        failedDefintions.forEach(originalDefinition -> {
            if (passedDefinitions.contains(originalDefinition)) {
                result.add(originalDefinition);
            }
        });
        return result;
    }
}
