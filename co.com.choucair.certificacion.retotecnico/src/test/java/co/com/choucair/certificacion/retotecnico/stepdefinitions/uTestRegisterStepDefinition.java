package co.com.choucair.certificacion.retotecnico.stepdefinitions;

import co.com.choucair.certificacion.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uTestRegisterStepDefinition {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^that Hugo wants to create a new user at uTest$")
    public void thatHugoWantsToCreateANewUserAtUTest() {
        OnStage.theActorCalled("Hugo").wasAbleTo(OpenUp.thePage());
    }

    @When("^he selects the Join Today button on the uTest webpage$")
    public void heSelectsTheJoinTodayButtonOnTheUTestWebpage() {

    }

    @Then("^he fills the new user creation form$")
    public void heFillsTheNewUserCreationForm() {

    }
}
