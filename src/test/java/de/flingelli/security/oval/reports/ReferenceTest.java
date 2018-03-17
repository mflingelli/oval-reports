package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReferenceTest {

    @Test
    public void getRefId() {
        Assert.assertEquals(TestHelper.getReference().getRefId(), "CVE-2018-6521");
    }

    @Test
    public void getRefUrl() {
        Assert.assertEquals(TestHelper.getReference().getRefUrl(), "http://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2018-6521");
    }

    @Test
    public void getSource() {
        Assert.assertEquals(TestHelper.getReference().getSource(), "CVE");
    }
}
