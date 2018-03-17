package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class Definition {
    @XmlAttribute
    private String id;
    @XmlAttribute
    private int version;
    @XmlAttribute(name = "class")
    private String clazz;
    @XmlElement(name = "metadata", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private Metadata metadata;

    public String getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public String getClazz() {
        return clazz;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition that = (Definition) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
