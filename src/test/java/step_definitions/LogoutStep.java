package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.LogoutPage;
import org.openqa.selenium.WebDriver;

public class LogoutStep {
    public WebDriver webDriver;

    public LogoutStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click profile menu")
    public void userClickProfileMenu() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Thread.sleep(1500);
        logoutPage.clickProfileMenu();
    }

    @And("User click logout")
    public void userClickLogout() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Thread.sleep(1500);
        logoutPage.clickLogOut();
    }

    @And("User click Yes")
    public void userClickYes() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Thread.sleep(1000);
        logoutPage.clickyesLogOut();
    }

    @And("User click No")
    public void userClickNo() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Thread.sleep(1000);
        logoutPage.clicknoLogOut();
    }
}
