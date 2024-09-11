package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Activity_8 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("The title of page is: " + driver.getTitle());
        driver.findElement(By.id("toggleCheckbox")).click();
        driver.findElement(By.id("toggleCheckbox")).click();
        driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
        driver.quit();


    }
}
