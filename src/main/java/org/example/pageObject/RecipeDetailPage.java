package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RecipeDetailPage {
    public static WebDriver driver;

    public RecipeDetailPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "[href='/search'] > [stroke='currentColor']")
    private WebElement btnSearch;
    public void clickBtnSearch(){
        btnSearch.click();
    }

    @FindBy(css = ".max-w-xl > div:nth-of-type(2) > div:nth-of-type(2) div:nth-of-type(2) > p:nth-of-type(1)")
    private WebElement nasgor;
    public void chooseNasgor(){
        nasgor.click();
    }

    @FindBy(css = ".grid-cols-2 .rounded-r-lg")
    private WebElement incBuy;
    public void clickIncBuy(){
        incBuy.click();
    }

    @FindBy(css = ".w-40")
    private WebElement btnAddCart;
    public void clickBtnAddCart(){
        btnAddCart.click();
    }

    @FindBy(css = ".input-primary")
    private WebElement addComment;
    public void setAddComment(String comment){
        addComment.sendKeys(comment);
    }

    @FindBy(css = ".btn-primary")
    private WebElement btnSubmitComment;
    public void clickBtnSubmitComment(){
        btnSubmitComment.click();
    }

    @FindBy(css = "div.gap-1 > .flex")
    private WebElement btnLike;
    public void clickBtnLike(){
        btnLike.click();
    }

    @FindBy(css = ".dropdown-end li:nth-of-type(1)")
    private WebElement btnReply;
    public void clickBtnReply(){
        btnReply.click();
    }

    @FindBy(css = ".input")
    private WebElement addReply;
    public void setAddReply(String reply){
        addReply.sendKeys(reply);
    }

    @FindBy(css = ".btn-primary")
    private WebElement btnSubmitReply;
    public void clickBtnSubmitReply(){
        btnSubmitReply.click();
    }

    @FindBy(css = "button.font-semibold")
    private WebElement recookPage;
    public boolean verRecookPage(){
        return recookPage.isDisplayed();
    }

    @FindBy(xpath = "//form/div[7]/input[@type='number']")
    private WebElement revPrice;
    public void setRevPrice(String rPrice){
        revPrice.clear();
        revPrice.sendKeys(rPrice);
    }

    @FindBy(css = ".btn-primary")
    private WebElement btnSubmitRecook;
    public void clickBtnSubmitRecook(){
        btnSubmitRecook.click();
    }

    @FindBy(css = ".flex[tabindex='0'] > .text-lg")
    private WebElement btnThreeDots;
    public void clickBtnThreeDots(){
        btnThreeDots.click();
    }

    @FindBy(css = ".block")
    private WebElement btnRecook;
    public void clickBtnRecook(){
        btnRecook.click();
    }
}
