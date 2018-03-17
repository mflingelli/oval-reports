package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CriteriaTest {

    @Test
    public void getOperator() {
        Assert.assertEquals(TestHelper.getCriteria().getOperator(), "AND");
    }

    @Test
    public void isResult() {
        Assert.assertFalse(TestHelper.getCriteria().isResult());
    }

    @Test
    public void getCriterions() {
        Assert.assertEquals(TestHelper.getCriteria().getCriterions().size(), 1);
    }

    @Test
    public void getCriteria() {
        Assert.assertNotNull(TestHelper.getCriteria().getCriteria());
    }
}
