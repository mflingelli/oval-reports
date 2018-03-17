package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAttribute;

public class TestedItem {
    @XmlAttribute(name = "item_id")
    private String itemId;
    @XmlAttribute
    private boolean result;

    public String getItemId() {
        return itemId;
    }

    public boolean isResult() {
        return result;
    }
}
