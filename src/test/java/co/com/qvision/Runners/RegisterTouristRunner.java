package co.com.qvision.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_user.feature",
        glue = "co.com.qvision.stepdefinitions.registerTourist",
        tags = "@Successful_register",
        snippets = SnippetType.CAMELCASE
)
public class RegisterTouristRunner {
}
