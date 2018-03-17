package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Metadata {
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private String title;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private Affected affected;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private Reference reference;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private String description;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private Debian debian;

    public String getTitle() {
        return title;
    }

    public Affected getAffected() {
        return affected;
    }

    public Reference getReference() {
        return reference;
    }

    public String getDescription() {
        return description;
    }

    public Debian getDebian() {
        return debian;
    }
}
