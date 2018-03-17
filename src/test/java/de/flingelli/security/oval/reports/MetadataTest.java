package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MetadataTest {

    @Test
    public void getTitle() {
        Assert.assertEquals(TestHelper.getMetadata().getTitle(), "CVE-2018-6521");
    }

    @Test
    public void getDescription() {
        Assert.assertEquals(TestHelper.getMetadata().getDescription(), "");
    }

}
