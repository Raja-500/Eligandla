import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    private WebDriver driver;
    @BeforeClass (alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void titletest() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"Target Practice");
    }

    @Test (groups = { "headertest" })
    public void headertest() {
        String T1 = driver.findElement(By.id("third-header")).getText();
        Assert.assertEquals("Third header", T1);
        WebElement element = driver.findElement(By.xpath("//h5[@class='ui green header']"));
        String cssValue = element.getCssValue("color");
        Assert.assertEquals(cssValue,"rgba(33, 186, 69, 1)");
    }

    @Test (groups = { "buttontest" })
    public void buttontest() {
        String button1 = driver.findElement(By.xpath("//button[text()='Olive']")).getText();
        Assert.assertEquals(button1, "Olive");
        WebElement brownelement = driver.findElement(By.xpath("//button[text()='Brown']"));
        String colour = brownelement.getCssValue("color");
        Assert.assertEquals(colour,"rgba(255, 255, 255, 1)");

    }

    @AfterClass (alwaysRun = true)
    public void teardown() {
        driver.quit();
    }

}
