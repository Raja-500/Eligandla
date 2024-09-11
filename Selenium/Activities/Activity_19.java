package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_19 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("The Page title is: " + driver.getTitle());
        driver.findElement(By.id("confirm")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("The alert message is: " + alert.getText());
        alert.accept();

        // for dismiss
        driver.findElement(By.id("confirm")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println("The alert message is: " + alert1.getText());

        alert1.dismiss();

        driver.quit();
    }
}
