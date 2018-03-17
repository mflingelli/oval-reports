package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

public class DebianTest {

    @Test
    public void getDate() {
        Assert.assertEquals(TestHelper.getMetadata().getDebian().getDate(), "2018-02-02");
    }

    @Test
    public void getDateAsDate() throws ParseException {
        Assert.assertEquals(TestHelper.convertDateToString(TestHelper.getMetadata().getDebian().getDateAsDate()),
                "02.02.2018 00:00:00");
    }

}
