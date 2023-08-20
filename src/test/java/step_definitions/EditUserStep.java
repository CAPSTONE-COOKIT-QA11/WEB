package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.EditUser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditUserStep {
    public WebDriver webDriver;

    public EditUserStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("user click pen and paper logo on profile information")
    public void userClickPenAndPaperLogoOnProfileInformation() {
        EditUser edit = new EditUser(webDriver);
        edit.clicklEditTab();
    }

    @Then("user already on Edit Profile page")
    public void userAlreadyOnEditProfilePage() throws InterruptedException {
        EditUser editUser = new EditUser(webDriver);
        Assert.assertTrue(editUser.ProfPageVer());
        Thread.sleep(5000);
    }

    @And("user Change and input new username {string}")
    public void userChangeAndInputNewUsername(String Name) throws InterruptedException {
        EditUser editUser = new EditUser(webDriver);
        editUser.revUrName(Name);
        Thread.sleep(1500);

    }

    @And("user input Bio in bio field {string}")
    public void userInputBioInBioField(String Description) throws InterruptedException {
        EditUser editUser = new EditUser(webDriver);
        editUser.reBiodesc(Description);
        Thread.sleep(1500);
    }

    @And("user click save button")
    public void userClickSaveButton() throws InterruptedException {
        EditUser editUser = new EditUser(webDriver);
        editUser.ClickSave();
        Thread.sleep(1500);
    }
    @And("user input current password {string}")
    public void userInputCurrentPassword(String CurrPas) throws InterruptedException {
        EditUser editUser =new EditUser(webDriver);
        editUser.CurrentPass(CurrPas);
        Thread.sleep(3000);
    }

    @And("user Input new password {string}")
    public void userInputNewPassword(String NewPass) throws InterruptedException {
        EditUser editUser = new EditUser(webDriver);
        editUser.EnterPass(NewPass);
        Thread.sleep(1500);
    }
    @And("user back input confirm new password {string}")
    public void userBackInputConfirmNewPassword(String ConfNewPass) throws InterruptedException {
        EditUser editUser = new EditUser(webDriver);
        editUser.ConfPass(ConfNewPass);
        Thread.sleep(1500);
    }
}
