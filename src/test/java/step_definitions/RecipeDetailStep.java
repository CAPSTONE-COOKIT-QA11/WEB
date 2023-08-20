package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.RecipeDetailPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RecipeDetailStep {
    public WebDriver webDriver;

    public RecipeDetailStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click search button")
    public void userClickSearchButton() throws InterruptedException {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnSearch();
        Thread.sleep(3000);
    }

    @And("User click recipe nasi goreng")
    public void userClickRecipe() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.chooseNasgor();
    }

    @And("User click + on but ingredient field")
    public void userClickOnButIngredientField() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickIncBuy();
    }

    @And("User click add to cart")
    public void userClickAddToCart() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnAddCart();
    }

    @When("Input {string} as comment")
    public void inputAsComment(String comment) {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.setAddComment(comment);
    }

    @And("User click submit for add comment")
    public void userClickSubmitForAddComment() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnSubmitComment();
    }

    @And("User like recipe nasi goreng")
    public void userLikeRecipeNasiGoreng() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnLike();
    }

    @And("User click three dots button")
    public void userClickThreeDotsButton() throws InterruptedException {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnThreeDots();
        Thread.sleep(3000);
    }

    @And("User click reply")
    public void userClickReply() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnReply();
    }

    @When("User input {string} as reply")
    public void userInputAsReply(String reply) throws InterruptedException {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.setAddReply(reply);
        Thread.sleep(1000);
    }

    @And("User click submit for reply")
    public void userClickSubmitForReply() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnSubmitReply();
    }

    @And("User click recook")
    public void userClickRecook() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnRecook();
    }

    @Then("User already on recook page")
    public void userAlreadyOnRecookPage() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        Assert.assertTrue(recipeDetailPage.verRecookPage());
    }

    @When("User input {string} as price")
    public void userInputAsPrice(String prce) throws InterruptedException {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        Thread.sleep(2000);
        recipeDetailPage.setRevPrice(prce);
    }

    @And("User click submit for recook")
    public void userClickSubmitForRecook() {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(webDriver);
        recipeDetailPage.clickBtnSubmitRecook();
    }
}
