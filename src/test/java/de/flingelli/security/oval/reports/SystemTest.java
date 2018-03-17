package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SystemTest {

    @Test
    public void getSystem()  {
        Assert.assertNotNull(TestHelper.getDefinitions().getResults().getSystem());
    }

    @Test
    public void getSystemDefinitions()  {
        Assert.assertEquals(TestHelper.getDefinitions().getResults().getSystem().getSystemDefinitions().size(), 2);
    }

    @Test
    public void getTests()  {
        Assert.assertEquals(TestHelper.getDefinitions().getResults().getSystem().getTests().size(), 2);
    }
}
