package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class DirectiveDefinition {
    @XmlAttribute
    private boolean reported;
    @XmlAttribute
    private String content;

    public boolean isReported() {
        return reported;
    }

    public String getContent() {
        return content;
    }
}
