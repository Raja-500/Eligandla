package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("The title of Webpage is:  " + driver.getTitle());
        System.out.println("the third header element text is: " + driver.findElement(By.id("third-header")).getText());
        WebElement element = driver.findElement(By.xpath("//h5[@class='ui green header']"));
        String cssValue = element.getCssValue("color");
        System.out.println("The colour of fifth element is: " + cssValue);

        WebElement ele2 = driver.findElement(By.xpath("//button[text()='Violet']"));
        String attr = ele2.getAttribute("class");
        System.out.println("The Class name of Voilet button is: " + attr);
        System.out.println("the Grey button text is: " + driver.findElement(By.xpath("//button[text()='Grey']")).getText());

        driver.quit();
    }
}
