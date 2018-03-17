package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class OvalDefinitions {
    @XmlElement(name = "generator", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private Generator generator;
    @XmlElementWrapper(name = "definitions", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    @XmlElement(name = "definition", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private List<Definition> definitions;

    public Generator getGenerator() {
        return generator;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public Definition getDefinitionById(String id) {
        for(Definition definition : definitions) {
            if (id.equals(definition.getId())) {
                return definition;
            }
        }
        return new Definition();
    }

}
