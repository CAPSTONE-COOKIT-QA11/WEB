package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStep {

    public WebDriver webDriver;

    public LoginStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User allready on landing page")
    public void userAllreadyOnLandingPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verLandingPage());
    }

    @When("User click sign in button")
    public void userClickSignInButton() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickBtnSignIn();
    }

    @Then("User allready on login page")
    public void userAllreadyOnLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verLoginPage());
    }

    @When("User input {string} as username and {string} as password")
    public void userInputAsUsernameAndAsPassword(String userName, String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
    }

    @And("User click login button")
    public void userClickLoginButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickBtnLogin();
        Thread.sleep(1000);
    }

    @Then("User allready on home page")
    public void userAllreadyOnHomePage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verHomePage());
        Thread.sleep(3000);
    }

    @And("Show {string} as pop-up")
    public void showAsPopUp(String A) {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(A, loginPage.showPopUp());
    }
}
