package project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 extends BaseClass {

    @Test
    public void verifyPageTitle() {
        setUp();

        //Print title of page
        String pagetitle = driver.getTitle();
        Assert.assertEquals(pagetitle, "OrangeHRM", "Page title not correct");

        tearDown();
    }
}
