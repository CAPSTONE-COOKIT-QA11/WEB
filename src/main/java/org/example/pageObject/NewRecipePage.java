package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewRecipePage {
    public static WebDriver driver;

    public NewRecipePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[.='New Post']")
    private WebElement btnNewPost;
    public void clickBtnNewPost(){
        btnNewPost.click();
    }

    @FindBy(xpath = "//a[.='New Recipe']")
    private WebElement btnNewRecipe;
    public void clickBtnNewRecipe(){
        btnNewRecipe.click();
    }

    @FindBy(css = "#name")
    private WebElement recipeTitle;
    public void setRecipeTitle(String title){
        recipeTitle.sendKeys(title);
    }

    @FindBy(css = "#description")
    private WebElement recipeDesc;
    public void setRecipeDesc(String desc){
        recipeDesc.sendKeys(desc);
    }

    @FindBy(css = "#imageInput")
    private WebElement recipeImage;
    public void setRecipeImage(String image){
        String path = System.getProperty("user.dir") + "/src/test/resources/images/" + image;
        recipeImage.sendKeys(path);
    }

    @FindBy(css = "div:nth-of-type(4) > .flex > .btn")
    private WebElement btnIncIngredient;
    public void clickbtnIncIngredient(){
        btnIncIngredient.click();
    }

    public void setFirstIngredient(int index, String fIngre){
        WebElement ingredient1 = driver.findElement(By.xpath("//form/div[4]/div[2]/input[" + index + "]"));
        ingredient1.sendKeys(fIngre);
    }

    public void setSecondIngredient(int index, String sIngre){
        WebElement ingredient2 = driver.findElement(By.xpath("//form/div[4]/div[3]/input[" + index + "]"));
        ingredient2.sendKeys(sIngre);
    }

    @FindBy(css = "div:nth-of-type(5) > .flex > .btn")
    private WebElement btnIncDirection;
    public void clickbtnIncDirection(){
        btnIncDirection.click();
    }

    @FindBy(css = "div:nth-of-type(5) > div:nth-of-type(2) > .input")
    private WebElement firstStep;
    public void setFirstStep(String fStep){
        firstStep.sendKeys(fStep);
    }

    @FindBy(css = "div:nth-of-type(5) > div:nth-of-type(3) > .input")
    private WebElement secondStep;
    public void setSecondStep(String sStep){
        secondStep.sendKeys(sStep);
    }

    @FindBy(css = ".checkbox")
    private WebElement btnChecklistSell;
    public void clickBtnChecklistSell(){
        btnChecklistSell.click();
    }

    @FindBy(xpath = "//input[@id='price']")
    private WebElement price;
    public void serPrice(String prce){
        price.sendKeys(prce);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary w-1/2 self-end mt-2']")
    private WebElement btnSubmit;
    public void clickBtnSubmit(){
        btnSubmit.click();
    }

    @FindBy(css = "button.font-semibold")
    private WebElement recipeDetailPage;
    public boolean verRecipeDetailPage(){
        return recipeDetailPage.isDisplayed();
    }

    @FindBy(css = "button.font-semibold")
    private WebElement newRecipePage;
    public boolean verNewRecipePage(){
        return newRecipePage.isDisplayed();
    }



}
