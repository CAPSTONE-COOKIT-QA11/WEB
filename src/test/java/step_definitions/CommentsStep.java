package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.Comments;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommentsStep {
    public WebDriver webDriver;

    public CommentsStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("user click Timeline")
    public void userClickTimeline() throws InterruptedException {
        Comments comments = new Comments(webDriver);
        comments.ClickTimeline();
        Thread.sleep(1500);
    }
    @And("user click comment logo")
    public void userClickCommentLogo() {
        Comments comments = new Comments(webDriver);
        comments.ClickComment();
    }
    @And("user already on comment page")
    public void userAlreadyOnCommentPage() throws InterruptedException {
        Comments comments = new Comments(webDriver);
        Assert.assertTrue(comments.Title());
        Thread.sleep(3000);
    }
    @And("user input comment on comment field {string}")
    public void userInputCommentOnCommentField(String Insrtcomments) {
        Comments comments = new Comments(webDriver);
        comments.addComment(Insrtcomments);
    }
    @When("user click increase image button")
    public void userClickIncreaseImageButton() throws InterruptedException {
        WebElement A = webDriver.findElement(By.xpath("//input[1]"));
        String X = "D:/WEB Cookit/src/test/resources/Image/Jempol.jpg";
        A.sendKeys(X);
        Thread.sleep(3000);
    }

    @And("user click submit button")
    public void userClickSubmitButton() {
        Comments comments = new Comments(webDriver);
        comments.ClickSubmitBtn();
    }

}
