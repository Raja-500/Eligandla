package project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3 extends BaseClass {

    @Test
    public void login(){
        setUp();
        login();

        String welcomeMsg = driver.findElement(By.id("welcome")).getText();
        Assert.assertTrue(welcomeMsg.contains("Welcome "), "Login was not successful");

        tearDown();
    }
}
