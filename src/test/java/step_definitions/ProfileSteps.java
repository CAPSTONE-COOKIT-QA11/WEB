package step_definitions;


import io.cucumber.java.en.*;
import org.example.pageObject.LoginPage;

import org.example.pageObject.ProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProfileSteps {

    final private WebDriver driver;

    public ProfileSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @When("^User click on Profile menu$")
    public void userClickOnProfileMenu() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickProfileMenu();
    }

}
