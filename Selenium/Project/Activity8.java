package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity8 extends BaseClass {

    @Test
    public void applyForLeave() throws InterruptedException {
        setUp();
        login();

        driver.findElement(By.xpath("//span[text() = 'Apply Leave']/parent::a")).click();

        WebElement dropdown = driver.findElement(By.id("applyleave_txtLeaveType"));
        Select leaveType = new Select(dropdown);
        dropdown.click();
        leaveType.selectByValue("1");

        WebElement from = driver.findElement(By.id("applyleave_txtFromDate"));
        from.clear();
        from.sendKeys("2024-06-26");
        WebElement to = driver.findElement(By.id("applyleave_txtToDate"));
        to.clear();
        to.sendKeys("2024-06-26");
        driver.findElement(By.id("applyleave_txtComment")).click();
        driver.findElement(By.id("applyBtn")).click();

        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
        from = driver.findElement(By.id("calFromDate"));
        to = driver.findElement(By.id("calToDate"));
        from.clear();
        to.clear();
        from.sendKeys("2024-06-26");
        to.sendKeys("2024-06-26");

        driver.findElement(By.id("btnSearch")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr/td[6]")).getText(), "Pending Approval(1.00)");

        tearDown();
    }
}
