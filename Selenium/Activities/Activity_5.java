package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Activity_5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        Actions act = new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("The title of WebPage is: " + driver.getTitle());
        WebElement dice = driver.findElement(By.id("D3Cube"));
        dice.click();
        String text1 = driver.findElement(By.className("active")).getText();
        System.out.println(text1);
        Thread.sleep(1000);
        //double click
        act.doubleClick(dice).build().perform();
        String text2 = driver.findElement(By.className("active")).getText();
        System.out.println(text2);
        Thread.sleep(1000);
        //right click
        act.contextClick(dice).build().perform();
        Thread.sleep(1000);
        String text3 = driver.findElement(By.className("active")).getText();
        System.out.println(text3);
        Thread.sleep(1000);
        driver.quit();

    }
}
