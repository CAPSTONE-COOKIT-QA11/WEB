//package org.example.pageObject;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class NewRecipePage {
//    public static WebDriver driver;
//
//    public NewRecipePage(WebDriver driver){
//        PageFactory.initElements(driver, this);
//        this.driver = driver;
//    }
//
//    @FindBy(xpath = "//button[.='New Post']")
//    private WebElement btnNewPost;
//    public void clickBtnNewPost(){
//        btnNewPost.click();
//    }
//
//    @FindBy(xpath = "//a[.='New Recipe']")
//    private WebElement btnNewRecipe;
//    public void clickBtnNewRecipe(){
//        btnNewRecipe.click();
//    }
//
//    @FindBy(css = "#name")
//    private WebElement recipeTitle;
//    public void setRecipeTitle(String title){
//        recipeTitle.sendKeys(title);
//    }
//
//    @FindBy(css = "#description")
//    private WebElement recipeDesc;
//    public void setRecipeDesc(String desc){
//        recipeTitle.sendKeys(desc);
//    }
//
//    @FindBy(css = "#imageInput")
//    private WebElement recipeImage;
//    public void setRecipeImage(String image){
//        recipeTitle.sendKeys(image);
//    }
//
//    @FindBy(css = "div:nth-of-type(4) > .flex > .btn")
//    private WebElement btnIncIngredient;
//    public void clickbtnIncIngredient(){
//        btnIncIngredient.click();
//    }
//
//    public void setFirstIngredient(int index, String fIngre){
//        WebElement ingredient1 = driver.findElement(By.xpath("//form/div[4]/div[2]/input[" + index + "]"));
//        ingredient1.sendKeys(fIngre);
//    }
//
//    public void setSecondIngredient(int index, String sIngre){
//        WebElement ingredient2 = driver.findElement(By.xpath("//form/div[4]/div[3]/input[" + index + "]"));
//        ingredient2.sendKeys(sIngre);
//    }
//
//    @FindBy(css = "div:nth-of-type(5) > .flex > .btn")
//    private WebElement btnIncDirection;
//
//    @FindBy(css = "div:nth-of-type(5) > div:nth-of-type(2) > .input")
//    private WebElement firstStep;
//    public void setUserName(String fStep){
//        userName.sendKeys(fStep);
//    }
//    public void clickbtnIncDirection(int index, String direct){
//        WebElement ingredient2 = driver.findElement(By.xpath("//form/div[4]/div[3]/input[" + index + "]"));
//        ingredient2.sendKeys(direct);
//    }
//
//}
