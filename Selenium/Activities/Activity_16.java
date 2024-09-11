package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_16 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        driver.manage().window().maximize();
        System.out.println("The pagetitle is: " + driver.getTitle());
        driver.findElement(By.cssSelector("input[class$='username']")).sendKeys("saurav");
        driver.findElement(By.cssSelector("input[class$='password']")).sendKeys("Saurav");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]")).sendKeys("Saurav");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("saurav@ok.com");
        driver.findElement(By.xpath("//button[@onclick='signUp()']")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='action-confirmation']"), "Thank you for registering, saurav"));
        System.out.println(driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
        driver.quit();
    }
}
