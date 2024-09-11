package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class Activity5 extends BaseClass {

    @Test
    public void editUserInformation() throws InterruptedException {
        setUp();
        login();

        //Click My Info
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value = 'Edit']")));
        //Click Edit
        driver.findElement(By.xpath("//input[@value = 'Edit']")).click();

        //Enter First Name
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Activity5");
        //Enter Last Name
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("LastName");

        //Change gender
        WebElement male = driver.findElement(By.id("personal_optGender_1"));
        WebElement female = driver.findElement(By.id("personal_optGender_2"));
        if(male.isSelected())
            female.click();
        else
            male.click();

        //Change Nationality
        WebElement dropDown = driver.findElement(By.id("personal_cmbNation"));
        Select nationality = new Select(dropDown);
        List<WebElement> options = nationality.getOptions();
        Random rand = new Random();
        int value = rand.nextInt(options.size());
        dropDown.click();
        nationality.selectByValue(String.valueOf(value));

        //Enter DOB
        driver.findElement(By.id("personal_DOB")).clear();
        driver.findElement(By.id("personal_DOB")).sendKeys("1998-12-16");

        //Click save
        driver.findElement(By.id("btnSave")).click();

        tearDown();
    }
}
