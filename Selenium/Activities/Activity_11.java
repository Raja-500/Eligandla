package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_11 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("The page title is: " + driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//input[@class='willDisappear']")).isSelected());
        driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@class='willDisappear']")).isSelected());
        driver.quit();

    }
}
