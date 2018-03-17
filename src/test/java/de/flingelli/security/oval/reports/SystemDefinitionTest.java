package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SystemDefinitionTest {

    @Test
    public void isResult() {
        Assert.assertFalse(TestHelper.getSystemDefinition().isResult());
    }

    @Test
    public void getDefinitionId() {
        Assert.assertEquals(TestHelper.getSystemDefinition().getDefinitionId(), "oval:org.debian:def:20186521");
    }


    @Test
    public void getVersion() {
        Assert.assertEquals(TestHelper.getSystemDefinition().getVersion(), 1);
    }
}
