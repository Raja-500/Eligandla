package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Activity_7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("The title of webpage is: " + driver.getTitle());
        WebElement ele1 = driver.findElement(By.id("droppable"));
        WebElement ele2 = driver.findElement(By.id("dropzone2"));
        WebElement drag_ele = driver.findElement(By.id("draggable"));
        act.dragAndDrop(drag_ele,ele1).build().perform();
        Thread.sleep(2000);
        System.out.println("The backgound colour dragzone1  is " + ele1.getAttribute("style"));
        act.dragAndDrop(ele1,ele2).build().perform();
        Thread.sleep(2000);
        System.out.println("The backgound colour dragzone2  is " + ele2.getAttribute("style"));
        driver.quit();

    }
}
