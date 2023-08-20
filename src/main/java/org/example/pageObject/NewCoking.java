package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCoking {
    public static WebDriver driver;
    public NewCoking(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(css = "button.gap-2")
    private WebElement newPostBtn;
    public void ClickNewPost(){
        newPostBtn.click();
    }
    @FindBy(xpath = "//a[.='New Cooking']")
    private WebElement NewCookingBtn;
    public void ClickNewCooking(){
        NewCookingBtn.click();
    }
    @FindBy(css = ".font-semibold")
    private WebElement NewCookPage;
    public boolean verNewCookingPage(){
        return NewCookPage.isDisplayed();
    }
    @FindBy(css = ".input")
    private WebElement Description;
    public void descriptionInput(String description){
        Description.sendKeys(description);
    }
    @FindBy(css = ".btn-secondary")
    private WebElement insertImage;
    public void imageInput(){
        String DIR = System.getProperty("user.dir");
        String image = DIR + "/src/test/resources/Image/sambalTerasi.jpg";
        insertImage.sendKeys(image);

    }
    @FindBy(css = ".btn-primary")
    private WebElement SubmitBtn;
    public void clickSubmitNewCooking(){
        SubmitBtn.click();
    }
    @FindBy(css = "button.font-semibold")
    private WebElement ProfilePage;
    public boolean verProfilePage(){
        return ProfilePage.isDisplayed();
    }
}
