package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Directives {
    @XmlElement(name = "definition_true")
    private DirectiveDefinition definitionTrue;
    @XmlElement(name = "definition_false")
    private DirectiveDefinition definitionFalse;
    @XmlElement(name ="definition_unknown")
    private DirectiveDefinition definitionUnknown;
    @XmlElement(name = "definition_error")
    private DirectiveDefinition definitionError;
    @XmlElement(name = "definition_not_evaluated")
    private DirectiveDefinition definitionNotEvaluated;
    @XmlElement(name = "definition_not_applicable")
    private DirectiveDefinition definitionNotApplicable;

    public DirectiveDefinition getDefinitionTrue() {
        return definitionTrue;
    }

    public DirectiveDefinition getDefinitionFalse() {
        return definitionFalse;
    }

    public DirectiveDefinition getDefinitionUnknown() {
        return definitionUnknown;
    }

    public DirectiveDefinition getDefinitionError() {
        return definitionError;
    }

    public DirectiveDefinition getDefinitionNotEvaluated() {
        return definitionNotEvaluated;
    }

    public DirectiveDefinition getDefinitionNotApplicable() {
        return definitionNotApplicable;
    }
}
