package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//p[@class='text-3xl md:text-4xl 2xl:text-5xl font-bold ']")
    private WebElement landingPage;
    public boolean verLandingPage(){
        return landingPage.isDisplayed();
    }

    @FindBy(css = ".px-4")
    private WebElement btnSignIn;
    public void clickBtnSignIn(){
        btnSignIn.click();
    }

    @FindBy(xpath = "//h1[@class='font-bold text-3xl']")
    private WebElement loginPage;
    public boolean verLoginPage(){
        return loginPage.isDisplayed();
    }

    @FindBy(css = "[placeholder='Username']")
    private WebElement userName;
    public void setUserName(String urName){
        userName.sendKeys(urName);
    }

    @FindBy(css = "[placeholder='Password']")
    private WebElement password;
    public void setPassword(String pword){
        password.sendKeys(pword);
    }

    @FindBy(css = ".h-8")
    private WebElement btnLogin;
    public void clickBtnLogin(){
        btnLogin.click();
    }

    @FindBy(css = ".justify-evenly")
    private WebElement homePage;
    public boolean verHomePage(){
        return homePage.isDisplayed();
    }

    @FindBy(css = ".block span")
    private WebElement popup;
    public String showPopUp(){
        return popup.getText();
    }
}