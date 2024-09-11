package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_20 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("The Page title is: " + driver.getTitle());
        driver.findElement(By.id("prompt")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("The alert message is: " + alert.getText());
        alert.sendKeys("Awesome");
        alert.accept();
        driver.quit();
    }
}
