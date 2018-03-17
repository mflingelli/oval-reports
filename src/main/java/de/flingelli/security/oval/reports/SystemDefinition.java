package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class SystemDefinition {
    @XmlAttribute(name = "definition_id")
    private String definitionId;
    @XmlAttribute
    private boolean result;
    @XmlAttribute
    private int version;
    @XmlElement
    private Criteria criteria;

    public String getDefinitionId() {
        return definitionId;
    }

    public boolean isResult() {
        return result;
    }

    public int getVersion() {
        return version;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public boolean hasTestRef(String testRef) {
        return criteria.hasTestRef(testRef);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemDefinition that = (SystemDefinition) o;
        return Objects.equals(definitionId, that.definitionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(definitionId);
    }
}
