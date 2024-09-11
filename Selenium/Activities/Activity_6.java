package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("The title of WebPage is: " + driver.getTitle());
        act.keyDown(Keys.SHIFT).sendKeys("s").build().perform();
        Thread.sleep(1000);
        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        driver.quit();
    }
}

