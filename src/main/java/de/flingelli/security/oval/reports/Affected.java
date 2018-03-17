package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Affected {
    @XmlAttribute
    private String family;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private String platform;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private String product;

    public String getFamily() {
        return family;
    }

    public String getPlatform() {
        return platform;
    }

    public String getProduct() {
        return product;
    }
}
