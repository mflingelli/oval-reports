package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestElementTest {

    @Test
    public void getTestId() {
        Assert.assertEquals(TestHelper.getTest().getTestId(), "oval:org.debian.oval:tst:1");
    }

    @Test
    public void getCheck() {
        Assert.assertEquals(TestHelper.getTest().getCheck(), "all");
    }

    @Test
    public void getVersion() {
        Assert.assertEquals(TestHelper.getTest().getVersion(), 1);
    }

    @Test
    public void getTestedItem() {
        Assert.assertNotNull(TestHelper.getTest().getTestedItem());
    }
}
