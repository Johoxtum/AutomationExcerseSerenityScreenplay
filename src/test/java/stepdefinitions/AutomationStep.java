package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.UserData;
import questions.CommonQuestions;
import task.InputDataTask;
import task.InputLoginTask;
import utils.data.DataManager;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static ui.LoginPage.AUTOMATION;
import static ui.RegisterPage.ACREATED;
import static utils.constants.Constants.REGISTER_DATA;

public class AutomationStep {

    @Given("que {word} ingresa a Automation Exercise")
    public void quePabloIngresaAAutomationExercise(String nameActor) {

        DataManager.initActorWithName(nameActor);

    }
    @When("diligencia el formulario")
    public void diligenciaElFormulario() {

        UserData userData = theActorInTheSpotlight().recall(REGISTER_DATA);
        theActorInTheSpotlight().attemptsTo(
                InputDataTask.withData(userData)
        );

    }
    @Then("debería visualizar {string}")
    public void deberíaVisualizar(String account) {
        CommonQuestions.textEquals(ACREATED,account);
    }

    @When("ingresa las credenciales de ingreso")
    public void ingresaLasCredencialesDeIngreso() {

        UserData userData = theActorInTheSpotlight().recall(REGISTER_DATA);
        theActorInTheSpotlight().attemptsTo(
                InputLoginTask.withLogin(userData)
        );
    }

    @Then("debería visualizar en el login {string}")
    public void deberíaVisualizarEnElLogin(String automation) {
        CommonQuestions.textEquals(AUTOMATION,automation);
    }
}
