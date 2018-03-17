package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

public class GeneratorTest {

    @Test
    public void getProductName() {
        Assert.assertEquals(TestHelper.getGenerator().getProductName(), "cpe:/a:open-scap:oscap");
    }

    @Test
    public void getSchemaVersion() {
        Assert.assertEquals(TestHelper.getGenerator().getSchemaVersion(), "5.3");
    }

    @Test
    public void getTimestamp() {
        Assert.assertEquals(TestHelper.getGenerator().getTimestamp(), "2018-02-02T15:18:11");
    }

    @Test
    public void getTimestampAsDate() throws ParseException {
        Assert.assertEquals(TestHelper.convertDateToString(TestHelper.getGenerator().getTimestampAsDate()),
                "02.02.2018 15:18:11");
    }
}
