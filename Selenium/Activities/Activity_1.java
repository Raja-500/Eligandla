package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net");
        driver.findElement(By.id("about-link")).click();
        System.out.println("The title of about us page is: " + driver.getTitle());
        driver.quit();

    }
}
