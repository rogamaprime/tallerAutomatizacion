package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static stepdefinitions.actors.COMMON_ACTOR;
import static utilities.constants.SCENARIO;

//Se crea para inicializar o finalizar el entorno
public class hooks {
    private static final Logger LOG = LoggerFactory.getLogger(hooks.class.getSimpleName());
    private static final String SEPARATOR = "*****************";
    private WebDriver driver = Serenity.getDriver();

    @Before

    public void setTheStageWeb(Scenario scenario) {
        OnStage.setTheStage(new OnlineCast());
        COMMON_ACTOR.whoCan(BrowseTheWeb.with(driver));
        COMMON_ACTOR.remember(SCENARIO, scenario.getName());
        COMMON_ACTOR.describedAs("Demo user");

        LOG.info(SEPARATOR);
        LOG.info("    Scenario: " + scenario.getName());
        LOG.info("    Tags: " + scenario.getSourceTagNames());
        LOG.info(SEPARATOR);
    }
}
