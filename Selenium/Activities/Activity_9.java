package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_9 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println("The tile of page is: " + driver.getTitle());
        driver.findElement(By.className("violet")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='ajax-content']/h1")));
        String msg1 = driver.findElement(By.xpath("//div[@id='ajax-content']/h1")).getText();
        System.out.println(msg1);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']/h3"),"I'm late!"));
        String msg2 = driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText();
        System.out.println(msg2);
        driver.quit();


    }
}
