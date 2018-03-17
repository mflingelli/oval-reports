package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DirectivesTest {

    @Test
    public void getDefinitionErrorContent() {
        Assert.assertEquals(TestHelper.getDirectives().getDefinitionError().getContent(), "full");
    }

    @Test
    public void getDefinitionErrorReported() {
        Assert.assertTrue(TestHelper.getDirectives().getDefinitionError().isReported());
    }

    @Test
    public void getDefinitionFalseContent() {
        Assert.assertEquals(TestHelper.getDirectives().getDefinitionFalse().getContent(), "full");
    }

    @Test
    public void getDefinitionFalseReported() {
        Assert.assertTrue(TestHelper.getDirectives().getDefinitionFalse().isReported());
    }
    @Test
    public void getDefinitionNotApplicableContent() {
        Assert.assertEquals(TestHelper.getDirectives().getDefinitionNotApplicable().getContent(), "full");
    }

    @Test
    public void getDefinitionNotApplicableReported() {
        Assert.assertTrue(TestHelper.getDirectives().getDefinitionNotApplicable().isReported());
    }

    @Test
    public void getDefinitionNotEvaluatedContent() {
        Assert.assertEquals(TestHelper.getDirectives().getDefinitionNotEvaluated().getContent(), "full");
    }

    @Test
    public void getDefinitionNotEvaluatedReported() {
        Assert.assertTrue(TestHelper.getDirectives().getDefinitionNotEvaluated().isReported());
    }

    @Test
    public void getDefinitionTrueContent() {
        Assert.assertEquals(TestHelper.getDirectives().getDefinitionTrue().getContent(), "full");
    }

    @Test
    public void getDefinitionTrueReported() {
        Assert.assertTrue(TestHelper.getDirectives().getDefinitionTrue().isReported());
    }

    @Test
    public void getDefinitionUnknownContent() {
        Assert.assertEquals(TestHelper.getDirectives().getDefinitionUnknown().getContent(), "full");
    }

    @Test
    public void getDefinitionUnknownReported() {
        Assert.assertTrue(TestHelper.getDirectives().getDefinitionUnknown().isReported());
    }
}
