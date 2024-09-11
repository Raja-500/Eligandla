import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void test1() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test
    public void test2() {
        String button_text = driver.findElement(By.className("black")).getText();
        System.out.println("Black button description is: " + button_text);
        Assert.assertEquals(button_text, "Purple");
    }

    @Test(enabled = false)
    public void test3() {
        String third_header = driver.findElement(By.id("third-header")).getText();
        Assert.assertEquals(third_header, "Third header");
    }

    @Test
    public void test4() throws SkipException {
        String condition ="Skip Test";

        if(condition.equals("Skip Test")){
            throw new SkipException("Skipping - This is not ready for testing ");
        } else {
            driver.findElement(By.id("red-button")).click();
        }
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
