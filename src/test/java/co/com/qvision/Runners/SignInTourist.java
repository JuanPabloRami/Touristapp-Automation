package co.com.qvision.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/sign_in_user.feature",
        glue = "co.com.qvision.stepdefinitions.signInTourist",
        tags = "@Successful_signin",
        snippets = SnippetType.CAMELCASE
)
public class SignInTourist {
}
