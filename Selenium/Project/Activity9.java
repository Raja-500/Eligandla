package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Activity9 extends BaseClass {

    @Test
    public void emergencyContacts() throws InterruptedException {
        setUp();
        login();

        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("//a[text() = 'Emergency Contacts']")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'emgcontact_list']/tbody/tr"));

        for(WebElement row:rows){
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for(WebElement column:columns){
                System.out.print(column.getText() + " ");
            }
            count++;
        }

        tearDown();
    }
}
