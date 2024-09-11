package project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Activity2 extends BaseClass {

    @Test
    public void printHeaderImageURL(){
        setUp();

        System.out.println(driver.findElement(By.tagName("img")).getAttribute("src"));

        tearDown();
    }
}
