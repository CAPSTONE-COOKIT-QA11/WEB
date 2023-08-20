
package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
    public static WebDriver driver;
    public Registration(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath ="//span[@class='font-semibold cursor-pointer']")
    private WebElement btnSignUp;
    public void ClickSignUp(){
        btnSignUp.click();
    }
    @FindBy(xpath = "//h1[@class='font-bold text-3xl']")
    private WebElement SignUpPage;
    public boolean verSignUpPage(){
        return SignUpPage.isDisplayed();
    }

    @FindBy(css = "[placeholder='username']")
    private WebElement userName;
    public void setuserName(String UserName){
        userName.sendKeys(UserName);
    }
    @FindBy(css = "[placeholder='Email']")
    private WebElement email;
    public void setEmail(String Email){
        email.sendKeys(Email);
    }
    @FindBy(css = "[placeholder='Password']")
    private WebElement password;
    public void setPassword(String Password){
        password.sendKeys(Password);
    }
    @FindBy(css = ".h-8")
    private WebElement SignUpBtn;
    public void setSignUpBtn(){
        SignUpBtn.click();
    }
    @FindBy(css = ".block span")
    private WebElement ErrorMassage;
    public boolean ErrMsg(){
        return ErrorMassage.isDisplayed();
    }



}
