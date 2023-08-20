package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.Registration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegistrationStep {
    public WebDriver webDriver;

    public RegistrationStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click sign up button")
    public void userClickSignUpButton() throws InterruptedException {
        Registration registration = new Registration(webDriver);
        registration.ClickSignUp();
        Thread.sleep(1500);
    }

    @When("User input {string} as username and {string} as email and {string} as password")
    public void userInputAsUsernameAndAsEmailAndAsPassword(String userName, String Email, String Password) throws InterruptedException {
        Registration registration = new Registration(webDriver);
        Thread.sleep(3000);
        registration.setuserName(userName);
        registration.setEmail(Email);
        registration.setPassword(Password);
    }

    @And("User click sign up button on register page")
    public void userClickSignUpButtonOnRegisterPage() {
        Registration registration = new Registration(webDriver);
        registration.setSignUpBtn();
    }

    @And("page Showing Error massage")
    public void pageShowingErrorMassage() {
        Registration registration = new Registration(webDriver);
        Assert.assertTrue(registration.ErrMsg());

    }
}