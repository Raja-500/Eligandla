package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_12 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("The pagetitle is: " + driver.getTitle());
        System.out.println(driver.findElement(By.id("input-text")).isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println(driver.findElement(By.id("input-text")).isEnabled());
        driver.quit();
    }
}
