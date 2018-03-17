package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Reference {
    @XmlAttribute(name = "source")
    private String source;
    @XmlAttribute(name = "ref_id")
    private String refId;
    @XmlAttribute(name = "ref_url")
    private String refUrl;

    public String getSource() {
        return source;
    }

    public String getRefId() {
        return refId;
    }

    public String getRefUrl() {
        return refUrl;
    }
}
