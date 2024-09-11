package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_18 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        driver.manage().window().maximize();
        System.out.println("The pagetitle is: " + driver.getTitle());
        //Find element using locator
        WebElement option = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select = new Select(option);
        select.selectByVisibleText("Javascript");
        Thread.sleep(2000);
        select.selectByIndex(4);
        select.selectByIndex(5);
        select.selectByIndex(6);
        select.selectByValue("node");
        Thread.sleep(2000);
        select.deselectByIndex(5);
        Thread.sleep(2000);
        driver.quit();
    }
}
