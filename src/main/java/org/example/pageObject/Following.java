package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Following {
    public static WebDriver driver;

    public Following(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css = "div:nth-of-type(7) [src='https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png']")
    private WebElement ProfilPicture;
    public void ClickProfPic(){
        ProfilPicture.click();
    }
    @FindBy(css = "button.font-semibold")
    private WebElement ProfilePage;
    public boolean verProfPage(){
        return ProfilePage.isDisplayed();
    }
    @FindBy(css = ".btn-primary")
    private WebElement FollowBtn;
    public void BtnFollow(){
        FollowBtn.click();
    }
    @FindBy(css = ".items-center.hidden [src='https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png']")
    private WebElement ProfilePic;
    public void ClickPicProf(){
        ProfilePic.click();
    }
    @FindBy(xpath = "//div[@class='hidden dropdown dropdown-bottom sm:block ']//a[.='Profile']")
    private WebElement ProfilHide;
    public void clickProfHide(){
        ProfilHide.click();
    }
    @FindBy(css = "button.font-semibold")
    private WebElement ProfilePageVer;
    public boolean ProfPageVer(){
        return ProfilePageVer.isDisplayed();
    }
    @FindBy(css = ".grid-cols-2 > p:nth-of-type(1)")
    private WebElement Followerstab;
    public void ClickFollowers(){
        Followerstab.click();
    }
    @FindBy(css = "button:nth-of-type(2)")
    private WebElement verFollowerPage;
    public boolean verFollPage(){
        return verFollowerPage.isDisplayed();
    }
    @FindBy(xpath = "//button[@class=' col-span-2 w-3/4 lg:w-1/2 place-self-end bg-secondary rounded-md h-8 text-white']")
    private WebElement FollBack;
    public void ClickFollBack(){
        FollBack.click();
    }
    @FindBy(css = ".grid-cols-2 > p:nth-of-type(2)")
    private WebElement following;
    public void Clickfollowing(){
        following.click();
    }
    @FindBy(css = "button:nth-of-type(2)")
    private WebElement verFollowingPage;
    public boolean FollowingPage(){
        return verFollowingPage.isDisplayed();
    }
    @FindBy(xpath = "//button[@class=' col-span-2 w-3/4 lg:w-1/2 place-self-end bg-red-600 rounded-md h-8 text-white']")
    private WebElement unFollow;
    public void UnFolltab(){
        unFollow.click();
    }
}
