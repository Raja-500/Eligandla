package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 extends BaseClass {

    @Test
    public void validateDirectory() throws InterruptedException {
        setUp();
        login();

        WebElement directory = driver.findElement(By.xpath("//b[text() = 'Directory']/parent::a"));
        Assert.assertTrue(directory.isDisplayed(), "Directory is not visible");
        if (directory.isEnabled()) {
            Assert.assertTrue(directory.isEnabled(), "Directory is not clickable");
            directory.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
            Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Search Directory", "Page heading not correct");
        }

        tearDown();
    }
}
