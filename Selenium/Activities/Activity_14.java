package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity_14 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        driver.manage().window().maximize();
        System.out.println("The pagetitle is: " + driver.getTitle());
        List<WebElement> row = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("The number of rows: " + row.size());
        System.out.println("The number of columns: " + column.size());
        System.out.println("The value of second row and scond cell is: " + driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead//th[1]")).click();
        System.out.println("The value od second row and scond cell after sort is: " + driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
        List<WebElement> tfooter = driver.findElements(By.xpath("//table[@id='sortableTable']//tfoot//th"));
        System.out.println("Values of table footer");
        for(WebElement ele:tfooter){
            System.out.println(ele.getText());
        }
        driver.quit();
    }
}
