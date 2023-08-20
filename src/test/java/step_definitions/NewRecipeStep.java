package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.NewRecipePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NewRecipeStep {
    public WebDriver webDriver;

    public NewRecipeStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click new post button")
    public void userClickNewPostButton() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.clickBtnNewPost();
        Thread.sleep(1000);
    }

    @And("User click new recipe")
    public void userClickNewRecipe() {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.clickBtnNewRecipe();
    }

    @Then("User allready on new recipe page")
    public void userAllreadyOnNewRecipePage() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        Assert.assertTrue(newRecipePage.verNewRecipePage());
        Thread.sleep(2000);
    }

    @When("Input {string} as recipe title")
    public void inputAsRecipeTitle(String title) {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.setRecipeTitle(title);
    }

    @And("Input {string} as description")
    public void inputAsDescription(String desc) {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.setRecipeDesc(desc);
    }

    @And("choose one image")
    public void chooseOneImage() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        Thread.sleep(1000);
        newRecipePage.setRecipeImage("sateKelinci.jpg");
    }

    @And("Click + button for add new ingredient")
    public void clickButtonForAddNewIngredient() {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.clickbtnIncIngredient();
    }

    @When("Input {string} as first ingredient name, {string} as first ingredient quantity, and {string} as first ingredient unit")
    public void inputAsFirstIngredientNameAsFirstIngredientQuantityAndAsFirstIngredientUnit(String name, String quantity, String unit) {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.setFirstIngredient(1, name);
        newRecipePage.setFirstIngredient(2, quantity);
        newRecipePage.setFirstIngredient(3, unit);
    }

    @When("Input {string} as second ingredient name, {string} as second ingredient quantity, and {string} as second ingredient unit")
    public void inputAsSecondIngredientNameAsSecondIngredientQuantityAndAsSecondIngredientUnit(String name, String quantity, String unit) {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.setSecondIngredient(1, name);
        newRecipePage.setSecondIngredient(2, quantity);
        newRecipePage.setSecondIngredient(3, unit);
    }

    @And("Click + button for add new step")
    public void clickButtonForAddNewStep() {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.clickbtnIncDirection();
    }

    @When("Input {string} as first step")
    public void inputFirstStep(String fStep) {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.setFirstStep(fStep);
    }

    @And("Input {string} as second step")
    public void inputSecondStep(String sStep) {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.setSecondStep(sStep);
    }

    @And("Checklist sell ingredient")
    public void checklistSellIngredient() {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.clickBtnChecklistSell();
    }

    @When("Input {string} as price")
    public void inputAsPrice(String prce) {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.serPrice(prce);
    }

    @And("Click submit button")
    public void clickSubmitButton() {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        newRecipePage.clickBtnSubmit();
    }

    @Then("User already on recipe detail page")
    public void userAlreadyOnRecipeDetailPage() throws InterruptedException {
        NewRecipePage newRecipePage = new NewRecipePage(webDriver);
        Assert.assertTrue(newRecipePage.verRecipeDetailPage());
        Thread.sleep(2000);
    }
}
