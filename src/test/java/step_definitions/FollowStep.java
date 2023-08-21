package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.Following;
import org.example.pageObject.NewCoking;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FollowStep {
    public WebDriver webDriver;
    public FollowStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("user click profile photo another user on recipes page")
    public void userClickProfilePhotoAnotherUserOnRecipesPage() {
        Following following = new Following(webDriver);
        following.ClickProfPic();
    }

    @When("user already on profile page another user")
    public void userAlreadyOnProfilePageAnotherUser() throws InterruptedException {
        Following following = new Following(webDriver);
        Assert.assertTrue(following.verProfPage());
        Thread.sleep(1500);
    }

    @And("user click follow button")
    public void userClickFollowButton() {
        Following following = new Following(webDriver);
        following.BtnFollow();
    }

    @And("user click profile")
    public void userClickProfile() throws InterruptedException {
        Following following = new Following(webDriver);
        following.ClickPicProf();
        Thread.sleep(1500);
    }

    @And("user click profile on pop on menu profile")
    public void userClickProfileOnPopOnMenuProfile() {
        Following following = new Following(webDriver);
        following.clickProfHide();
    }

    @Then("user allready in profile page")
    public void userAllreadyInProfilePage() throws InterruptedException {
        Following following = new Following(webDriver);
        Assert.assertTrue(following.ProfPageVer());
        Thread.sleep(3000);
    }

    @And("user click followers")
    public void userClickFollowers() {
        Following following = new Following(webDriver);
        following.ClickFollowers();
    }
    @When("user allready on followers page")
    public void userAllreadyOnFollowersPage() {
        Following following = new Following(webDriver);
        Assert.assertTrue(following.verFollPage());
    }

    @And("user Click follow back in one of another user")
    public void userClickFollowBackInOneOfAnotherUser() {
        Following following = new Following(webDriver);
        following.ClickFollBack();
    }

    @And("user click following")
    public void userClickFollowing() {
        Following following = new Following(webDriver);
        following.Clickfollowing();
    }

    @When("user already on following page")
    public void userAlreadyOnFollowingPage() throws InterruptedException {
        Following following = new Following(webDriver);
        Assert.assertTrue(following.FollowingPage());
        Thread.sleep(1500);
    }

    @And("user click unfollow on one of another user")
    public void userClickUnfollowOnOneOfAnotherUser() {
        Following following = new Following(webDriver);
        following.UnFolltab();
    }
}
