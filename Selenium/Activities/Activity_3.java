package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("The tile of page is: " + driver.getTitle());
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
