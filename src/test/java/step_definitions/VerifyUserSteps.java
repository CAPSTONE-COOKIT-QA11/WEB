package step_definitions;


import io.cucumber.java.en.*;
import org.example.pageObject.LoginPage;
import org.example.pageObject.VerifyUserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class VerifyUserSteps {
    final private WebDriver driver;

    public VerifyUserSteps() {
        super();
        this.driver = Hooks.webDriver;
    }
    @Then("^User already on Home Page$")
    public void userAlreadyOnHomePage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(loginPage.validateHomePageTitle());
    }
    @And("^User click on verify users menu$")
    public void userClickOnVerifyUsersMenu() {
        VerifyUserPage verifUser = new VerifyUserPage(driver);
        verifUser.clickMenuListVerifyUser();
    }

    @Then("^User already on Verify Users page$")
    public void userAlreadyOnVerifyUsersPage() throws InterruptedException {
        VerifyUserPage verifUser = new VerifyUserPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(verifUser.validateVerifyUsersPage());
    }

    @When("^User click checklist button on first user$")
    public void userClickChecklistButtonOnFirstUser() {
        VerifyUserPage verifUser = new VerifyUserPage(driver);
        verifUser.clickChecklistBtn();
    }

    @Then("^First user that already verified should not be displayed$")
    public void firstUserThatAlreadyVerifiedShouldNotBeDisplayed() throws InterruptedException {
        VerifyUserPage verifUser = new VerifyUserPage(driver);
        Thread.sleep(4000);
        Assert.assertFalse(verifUser.validateFirstUserName());
    }
}
