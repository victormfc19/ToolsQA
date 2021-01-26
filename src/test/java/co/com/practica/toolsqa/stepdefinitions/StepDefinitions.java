package co.com.practica.toolsqa.stepdefinitions;

import co.com.practica.toolsqa.questions.ValidateData;
import co.com.practica.toolsqa.tasks.FillForm;
import co.com.practica.toolsqa.tasks.RadioButtonSelect;
import co.com.practica.toolsqa.util.driver.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import java.util.Map;

public class StepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("victor");
    }

    @Given("^the user is on the page ToolsQA$")
    public void theUserIsOnThePageToolsQA() {
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.getDriver().openUrl("https://demoqa.com/")));
    }

    @When("^the user completes the corresponding fields$")
    public void theUserCompletesTheCorrespondingFields(List<Map<String, String>> dataFields) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm.completeData(dataFields));
    }

    @Then("^he should see the summary of your information '(.*)'$")
    public void heShouldSeeTheSummaryOfYourInformation(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateData.validateData(), Matchers.is(message)));
    }

    @When("^he enters the data incorrectly$")
    public void heEntersTheDataIncorrectly(List<Map<String, String>> dataFields) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm.completeData(dataFields));
    }

    @Then("^the user should not see the summary of their information$")
    public void theUserShouldNotSeeTheSummaryOfTheirInformation() {

    }

    @When("^i select the radio button Yes$")
    public void iSelectTheRadioButtonYes() {
        OnStage.theActorInTheSpotlight().attemptsTo(RadioButtonSelect.select());
    }

    @Then("^I should see  'Yes'$")
    public void iShouldSeeYes() {

    }


}
