import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    private WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void test() {
        driver.findElement(By.id("username")).sendKeys("saurav");
        driver.findElement(By.id("password")).sendKeys("lallu");
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
        String msg = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(msg,"Invalid Credentials");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
