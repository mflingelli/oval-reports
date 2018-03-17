package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

public class OvalDefinitionsTest {

    @Test
    public void getGenerator() {
        Assert.assertNotNull(TestHelper.getDefinitions().getOvalDefinitions().getGenerator());
    }

    @Test
    public void getTimestampAsDate() throws ParseException{
        Assert.assertEquals(TestHelper.convertDateToString(TestHelper.getDefinitions().getOvalDefinitions().getGenerator().getTimestampAsDate()),
                "02.02.2018 12:07:33");
    }
}
