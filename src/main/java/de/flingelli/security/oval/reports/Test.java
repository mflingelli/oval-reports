package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Test {
    @XmlAttribute(name = "test_id")
    private String testId;
    @XmlAttribute
    private int version;
    @XmlAttribute
    private String check;
    @XmlAttribute
    private boolean result;
    @XmlElement(name = "tested_item")
    private TestedItem testedItem;

    public String getTestId() {
        return testId;
    }

    public int getVersion() {
        return version;
    }

    public String getCheck() {
        return check;
    }

    public boolean isResult() {
        return result;
    }

    public TestedItem getTestedItem() {
        return testedItem;
    }
}
