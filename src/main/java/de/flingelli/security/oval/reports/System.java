package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class System {
    @XmlElementWrapper(name = "definitions")
    @XmlElement(name = "definition")
    private List<SystemDefinition> systemDefinitions;
    @XmlElementWrapper(name = "tests")
    @XmlElement(name = "test")
    private List<Test> tests;

    public List<SystemDefinition> getSystemDefinitions() {
        return systemDefinitions;
    }

    public List<Test> getTests() {
        return tests;
    }

    public String getDefinitionIdByTestReference(String testRef) {
        for(SystemDefinition definition : systemDefinitions) {
            if (definition.hasTestRef(testRef)) {
                return definition.getDefinitionId();
            }
        }
        return "";
    }
}
