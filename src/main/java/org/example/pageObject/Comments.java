package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Comment {
    public static WebDriver driver;

    public Comment(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[.='Timeline']")
    private WebElement Timeline;
    public void ClickTimeline(){
        Timeline.click();
    }
    @FindBy(css = ".max-w-xl > div:nth-of-type(3) button > .text-lg")
    private WebElement CommentTab;
    public void ClickComment(){
        CommentTab.click();
    }
    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement Tittle;
    public boolean Title(){
        return Tittle.isDisplayed();
    }
    @FindBy(css = ".input")
    private WebElement CommentColumn;
    public void addComment(String comment){
        CommentColumn.sendKeys(comment);
    }
    @FindBy(css = ".btn-primary")
    private WebElement SubmitBtn;
    public void ClickSubmitBtn(){
        SubmitBtn.click();
    }
}
