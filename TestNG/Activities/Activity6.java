import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    private WebDriver driver;

    @BeforeClass (alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        driver.manage().window().maximize();
    }

    @Test
    @Parameters({ "sUsername", "sPassword" })
    public void test(String sUsername, String sPassword) {
        driver.findElement(By.id("username")).sendKeys(sUsername);
        driver.findElement(By.id("password")).sendKeys(sPassword);
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
        String msg = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(msg, "Welcome Back, admin");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
