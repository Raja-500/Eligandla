package project;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity7 extends BaseClass {

    @Test
    public void addQualification() throws InterruptedException {
        setUp();
        login();

        //Click My Info
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value = 'Edit']")));
        //Click Edit
        driver.findElement(By.xpath("(//a[text() = 'Qualifications'])[2]")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text() = 'Work Experience']"))));

        //Delete all jobs
        driver.findElement(By.id("workCheckAll")).click();
        driver.findElement(By.id("delWorkExperience")).click();

        //Click Add
        driver.findElement(By.id("addWorkExperience")).click();
        //Enter Company
        driver.findElement(By.id("experience_employer")).sendKeys("Nutcraker");
        //Enter Job title
        driver.findElement(By.id("experience_jobtitle")).sendKeys("Hacker");
        //Save
        driver.findElement(By.id("btnWorkExpSave")).click();

        Assert.assertNotEquals(driver.findElement(By.xpath("(//table/tbody/tr)[1]/td[2]")).getText(), "No Records Found", "Record not added");

        tearDown();
    }
}
