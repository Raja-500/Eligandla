package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Activity_17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        driver.manage().window().maximize();
        System.out.println("The pagetitle is: " + driver.getTitle());
        //Find element using locator
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByValue("4");
        Thread.sleep(2000);
        List<WebElement> options = select.getOptions();
        for (WebElement ele:options){
            System.out.println(ele.getText());
        }
        driver.quit();
    }
}
