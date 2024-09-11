package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_22 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/popups");
        System.out.println("The Page title is: " + driver.getTitle());
        String msg = driver.findElement(By.xpath("//button[@onclick='openModal()']")).getText();
        System.out.println("The Signup Page message is: " + msg);
        driver.findElement(By.xpath("//button[@onclick='openModal()']")).click();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
        String Conf_msg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(Conf_msg);
        driver.quit();

    }
}
