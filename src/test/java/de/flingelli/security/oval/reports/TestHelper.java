package de.flingelli.security.oval.reports;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestHelper {

    public static Test getTest() {
        return getDefinitions().getResults().getSystem().getTests().get(0);
    }

    public static SystemDefinition getSystemDefinition() {
        return getSystem().getSystemDefinitions().get(0);
    }

    public static Criteria getCriteria() {
        return getSystem().getSystemDefinitions().get(0).getCriteria();
    }

    public static List<Criterion> getCriterions() {
        return getSystem().getSystemDefinitions().get(0).getCriteria().getCriterions();
    }

    public static System getSystem() {
        return getResults().getSystem();
    }

    public static Results getResults() {
        return getDefinitions().getResults();
    }

    public static Reference getReference() {
        return getMetadata().getReference();
    }

    public static Metadata getMetadata() {
        return getDefinition().getMetadata();
    }

    public static Definition getDefinition() {
        return getDefinitions().getOvalDefinitions().getDefinitions().get(0);
    }

    public static Directives getDirectives() {
        return getDefinitions().getDirectives();
    }

    public static Generator getGenerator() {
        return getDefinitions().getGenerator();
    }

    public static OvalResults getDefinitions() {
        return getDefinitions(new File("src/test/resources/definitions.xml"));
    }

    public static OvalResults getDefinitions(File file) {
        OvalResults results = new OvalResults();
        try {
            results.readXML(file.getAbsolutePath());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return results;
    }

    public static String convertDateToString(Date date) {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date);
    }

}
