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
    public void userAllreadyOnLandingPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verLandingPage());
        Thread.sleep(1500);
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
        Thread.sleep(1500);

        Thread.sleep(2000);

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



    @And("User click username field")
    public void userClickUsernameField() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickUsernameField();
    }

    @When("User input {string} as username")
    public void userInputAsUsername(String usName) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(usName);
    }

    @And("User click password field")
    public void userClickPasswordField() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickPasswordField();
    }

    @And("User click visibility button on password field")
    public void userClickVisibilityButtonOnPasswordField() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickBtnVisibility();
    }

    @When("User input {string} as password")
    public void userInputAsPassword(String pass) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setPassword(pass);
    }
}
