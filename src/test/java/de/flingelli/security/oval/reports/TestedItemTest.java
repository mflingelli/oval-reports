package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestedItemTest {

    @Test
    public void getItemId() {
        Assert.assertEquals(TestHelper.getTest().getTestedItem().getItemId(), "1027241");
    }

    @Test
    public void isResult() {
        Assert.assertTrue(TestHelper.getTest().getTestedItem().isResult());
    }
}
