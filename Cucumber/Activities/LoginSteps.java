package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


public class LoginSteps extends BaseClass {
    @Given("User is on Login page")
    public void openLoginPage() {
        driver.get("https://v1.training-support.net/selenium/login-form");
        String title = driver.getTitle();
        System.out.println("Home page title is"+ title);

        Assertions.assertEquals("Login Form", driver.getTitle());
    }

    @When("User enters username and password")
     public void enterCredentials() {

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @When("User enters {string} and {string}")
    public void enterCredentials(String username,String password) {

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Read the page title and confirmation message")
     public void verifyLogin(){
        String LoginMessage =driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("confirmation message is" + LoginMessage);
                Assertions.assertEquals("Welcome Back, admin", LoginMessage);

    }
}
