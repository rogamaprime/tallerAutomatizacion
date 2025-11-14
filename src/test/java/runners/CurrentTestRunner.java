package runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Clase que ejecuta los escenarios
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "rerun:target/rerun.txt", "json:target/destination/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions"},
        //tags = "@login",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CurrentTestRunner {
}
