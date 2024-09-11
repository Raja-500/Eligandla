package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity_13 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("The pagetitle is: " + driver.getTitle());
        List<WebElement> row = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        List<WebElement> column = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        System.out.println("The number of rows: " + row.size());
        System.out.println("The number of columns: " + column.size());
        List<WebElement> third_row_cell_ele = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
        for(WebElement ele:third_row_cell_ele){
            System.out.println(ele.getText());
        }
        System.out.println("Second row second column value is: " + driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]")).getText());
        driver.quit();
    }
}
