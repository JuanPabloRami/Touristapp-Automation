package co.com.qvision.stepdefinitions.createBusiness;

import com.co.qvision.tasks.createBusiness.CreateBusinessTask;
import com.co.qvision.tasks.register.OpenThePage;
import com.co.qvision.tasks.signIn.SignInUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CreateBusinessStepDefinition {

    @Managed(driver ="chrome")
    private WebDriver hisBrowser;

    private Actor Alejo = Actor.named("Alejo");

    @Before
    public void setUp(){
        Alejo.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^Alejo want to create a business$")
    public void alejoWantToCreateABusiness() {
        Alejo.wasAbleTo(OpenThePage.on());
        Alejo.wasAbleTo(SignInUser.on());
    }

    @When("^He fills in the form fields$")
    public void heFillsInTheFormFields() throws InterruptedException {
        Thread.sleep(6000);
        Alejo.wasAbleTo(CreateBusinessTask.create());
        Thread.sleep(5000);
    }

    @Then("^He should sees the profile created with success$")
    public void heShouldSeesTheProfileCreatedWithSuccess() {

    }
}
