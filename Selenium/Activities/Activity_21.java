package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Activity_21 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println("The Page title is: " + driver.getTitle());
        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.id("launcher")).click();
        Set<String> handles = driver.getWindowHandles();
        // Loop through the Set and switch to the window
        // whose handle doesn't match the parentHandle
        for (String handle : handles) {
            if (handle != parentHandle) {
                driver.switchTo().window(handle);
            }
        }
        System.out.println("The newly opened page title is: " + driver.getTitle());
        String childHandle = driver.getWindowHandle();
        driver.findElement(By.id("actionButton")).click();
        Set<String> newhandles = driver.getWindowHandles();
        for (String handle1 : newhandles) {
            if (handle1 != parentHandle & handle1 != childHandle) {
                driver.switchTo().window(handle1);
            }
        }
        System.out.println("The newly opened second page title is: " + driver.getTitle());
        driver.quit();


    }
}