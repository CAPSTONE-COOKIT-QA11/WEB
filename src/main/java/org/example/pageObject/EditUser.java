package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUser {
    public static WebDriver driver;

    public EditUser(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@class=' text-primary place-self-end mb-24 text-2xl rounded-full']")
    private WebElement EditTab;
    public void clicklEditTab(){
        EditTab.click();
    }
    @FindBy(xpath = "//button[@class='font-semibold']")
    private WebElement EditProfilePage;
    public boolean ProfPageVer(){
        return EditProfilePage.isDisplayed();
    }
    @FindBy(xpath = "//input[@class='border-r border-l border-t border-b border-1 border-primary outline-none rounded-md px-2 py-1']")
    private WebElement revUsername;
    public void revUrName(String Name){
        revUsername.clear();
        revUsername.sendKeys(Name);
    }
    @FindBy(xpath = "//textarea[@class='border-r border-l border-t border-b border-1 border-primary outline-none rounded-md px-2 py-1']")
    private WebElement revBio;
    public void reBiodesc(String Desc){
        revBio.clear();
        revBio.sendKeys(Desc);
    }
    @FindBy(css = "[placeholder='Enter current password']")
    private WebElement CurrentPass;
    public void CurrentPass(String curPass){
        CurrentPass.sendKeys(curPass);
    }
    @FindBy(css = "[placeholder='Enter new password']")
    private WebElement EnterPassword;
    public void EnterPass(String EntPass){
        EnterPassword.sendKeys(EntPass);
    }
    @FindBy(css = "[placeholder='Confirm new password']")
    private WebElement ConfirmPassword;
    public void ConfPass(String ConfirmPass){
        ConfirmPassword.sendKeys(ConfirmPass);
    }
    @FindBy(xpath = "//button[@class='w-24 lg:w-32 py-1 rounded-md place-self-center bg-secondary text-white']")
    private WebElement SaveTab;
    public void ClickSave(){
        SaveTab.click();
    }

}
