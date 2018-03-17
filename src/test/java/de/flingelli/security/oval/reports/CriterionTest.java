package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CriterionTest {

    @Test
    public void getTestRef() {
        Assert.assertEquals(TestHelper.getCriterions().get(0).getTestRef(), "oval:org.debian.oval:tst:1");
    }

    @Test
    public void getVersion() {
        Assert.assertEquals(TestHelper.getCriterions().get(0).getVersion(), "1");
    }

    @Test
    public void isResult() {
        Assert.assertTrue(TestHelper.getCriterions().get(0).isResult());
    }
}
