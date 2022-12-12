package co.com.qvision.stepdefinitions.commentBusiness;

import com.co.qvision.tasks.commentBusiness.CommentBusiness;
import com.co.qvision.tasks.register.OpenThePage;
import com.co.qvision.tasks.signIn.SignInTourist;
import com.co.qvision.tasks.signIn.SignInUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CommentBusinesStepdefinition {
    @Managed(driver ="chrome")
    private WebDriver hisBrowser;

    private Actor Alejo = Actor.named("Alejo");

    @Before
    public void setUp(){
        Alejo.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^Alejo want to comment a business$")
    public void alejoWantToCommentABusiness() {
        Alejo.wasAbleTo(OpenThePage.on());
        Alejo.wasAbleTo(SignInTourist.on());
    }


    @When("^He write a comment$")
    public void heWriteAComment() throws InterruptedException {
        Thread.sleep(6000);
        Alejo.wasAbleTo(CommentBusiness.the());
    }

    @Then("^He should sees the comment in the business$")
    public void heShouldSeesTheCommentInTheBusiness() {

    }
}
