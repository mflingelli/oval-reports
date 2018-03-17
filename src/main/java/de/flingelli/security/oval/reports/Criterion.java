package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAttribute;

public class Criterion {
    @XmlAttribute(name = "test_ref")
    private String testRef;
    @XmlAttribute
    private String version;
    @XmlAttribute
    private String comment;
    @XmlAttribute
    private boolean result;

    public String getTestRef() {
        return testRef;
    }

    public String getVersion() {
        return version;
    }

    public String getComment() {
        return comment;
    }

    public boolean isResult() {
        return result;
    }
}
