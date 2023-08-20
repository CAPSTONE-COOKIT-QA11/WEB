package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public static WebDriver driver;

    public LogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']")
    private WebElement profileMenu;
    public void clickProfileMenu(){
        profileMenu.click();
    }

    @FindBy(css = ".dropdown.hidden span")
    private WebElement LogOut;
    public void clickLogOut(){
        LogOut.click();
    }

    @FindBy(css = ".swal2-confirm")
    private WebElement yesLogOut;
    public void clickyesLogOut(){
        yesLogOut.click();
    }
    @FindBy(css = ".swal2-cancel")
    private WebElement noLogOut;
    public void clicknoLogOut(){
        noLogOut.click();
    }
}