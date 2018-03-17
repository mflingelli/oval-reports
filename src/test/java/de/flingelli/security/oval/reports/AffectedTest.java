package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AffectedTest {

    @Test
    public void getFamily() {
        Assert.assertEquals(TestHelper.getMetadata().getAffected().getFamily(), "unix");
    }

    @Test
    public void getPlatform() {
        Assert.assertEquals(TestHelper.getMetadata().getAffected().getPlatform(), "Debian GNU/Linux 8");
    }

    @Test
    public void getProduct() {
        Assert.assertEquals(TestHelper.getMetadata().getAffected().getProduct(), "simplesamlphp");
    }

}
