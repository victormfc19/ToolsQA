package co.com.practica.toolsqa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/widgets.feature",
        glue = "co.com.practica.toolsqa.stepdefinitions" ,
        snippets = SnippetType.CAMELCASE
)
public class AlertsRunner {
}
