package co.com.qvision.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_business.feature",
        glue = "co.com.qvision.stepdefinitions.createBusiness",
        tags = "@Successful_create",
        snippets = SnippetType.CAMELCASE
)
public class CreateBusinessRunner {
}
