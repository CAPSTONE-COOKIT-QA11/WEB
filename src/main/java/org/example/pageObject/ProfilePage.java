package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public static WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        ProfilePage.driver = driver;
    }

    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']")
    private WebElement profileMenu;

    public void clickProfileMenu() {
        profileMenu.click();
    }
}