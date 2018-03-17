package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DefinitionTest {

    @Test
    public void getId() {
        Assert.assertEquals(TestHelper.getDefinition().getId(), "oval:org.debian:def:20186521");
    }

    @Test
    public void getClazz() {
        Assert.assertEquals(TestHelper.getDefinition().getClazz(), "vulnerability");
    }

    @Test
    public void getVersion() {
        Assert.assertEquals(TestHelper.getDefinition().getVersion(), 1);
    }

    @Test
    public void getMetadata() {
        Assert.assertNotNull(TestHelper.getDefinition().getMetadata());
    }
}
