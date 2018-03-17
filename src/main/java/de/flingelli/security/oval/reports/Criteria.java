package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Criteria {
    @XmlAttribute
    private String operator;
    @XmlAttribute
    private String comment;
    @XmlAttribute
    private boolean result;
    @XmlElement(name = "criterion")
    private List<Criterion> criterions = new ArrayList<>();
    @XmlElement(name = "criteria")
    private Criteria criteria;

    public String getOperator() {
        return operator;
    }

    public String getComment() {
        return comment;
    }

    public boolean isResult() {
        return result;
    }

    public List<Criterion> getCriterions() {
        return criterions;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public boolean hasTestRef(String testRef) {
        for(Criterion criterion : criterions) {
            if (testRef.equals(criterion.getTestRef())) {
                return true;
            }
        }
        if (criteria != null) {
            return criteria.hasTestRef(testRef);
        }
        return false;
    }
}
