package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.NewCoking;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCookingStep {

    public WebDriver webDriver;
    public NewCookingStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User Click new post")
    public void userClickNewPost() {
        NewCoking newCoking= new NewCoking(webDriver);
        newCoking.ClickNewPost();
    }

    @And("user click new cooking")
    public void userClickNewCooking() {
        NewCoking newCoking = new NewCoking(webDriver);
        newCoking.ClickNewCooking();
    }

    @And("user input {string} on Description field")
    public void userInputOnDescriptionField(String description) {
        NewCoking newCoking = new NewCoking(webDriver);
        newCoking.descriptionInput(description);

    }

    @And("input image new cooking")
    public void inputImageNewCooking() throws InterruptedException {
        WebElement X = webDriver.findElement(By.xpath("//input[1]"));
        String V = "D:/WEB Cookit/src/test/resources/Image/sambalTerasi.jpg";
        X.sendKeys(V);
        Thread.sleep(3000);
        }

    @And("user click submit new Cooking")
    public void userClickSubmitNewCooking() {
        NewCoking newCoking = new NewCoking(webDriver);
        newCoking.clickSubmitNewCooking();
    }

    @Then("user already on dashboard page")
    public void userAlreadyOnDashboardPage() throws InterruptedException {
        NewCoking newCoking = new NewCoking(webDriver);
        Assert.assertTrue(newCoking.verNewCookingPage());
        Thread.sleep(1500);


    }
}
