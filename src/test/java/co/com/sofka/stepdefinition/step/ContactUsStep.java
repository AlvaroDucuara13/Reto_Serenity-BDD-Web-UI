package co.com.sofka.stepdefinition.step;

import co.com.sofka.models.datosRandomModel.DatosModelRandom;
import co.com.sofka.stepdefinition.setup.Setup;
import co.com.sofka.tasks.landingpage.OpenLandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static co.com.sofka.tasks.ContacUs.BrowserToContactUs.browseToContacUs;
import static co.com.sofka.tasks.ContacUs.FillContactUsForm.fillContactUsForm;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.util.ConstantsKey.WEBMASTER;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContactUsStep extends Setup {
    private static final Logger LOGGER = Logger.getLogger(ContactUsStep.class);
    private static final String Actor = "AlvaroD";
    private static DatosModelRandom random;

    @Given("El cliente se encuentra en la plataforma web automationpractice.com")
    public void elClienteSeEncuentraEnLaPlataformaWebAutomationpracticeCom() {

        try {
            actorSetupTheBrowser(Actor);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()

            );

        }catch (Exception e){
            LOGGER.error(e.getMessage(), e);
        }

    }

    @When("El cliente ingresa sus datos personales y su mensaje de requerimiento")
    public void elClienteIngresaSusDatosPersonalesYSuMensajeDeRequerimiento() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    browseToContacUs(),
                    fillContactUsForm()
                            .UsingHeading(WEBMASTER.getValue())
                            .UsingEmail(random.getEmail())
                            .UsingOrderReference(random.getOrderReference())
                            .AndUSingMessage(random.getMessage())
            );

        }catch (Exception e){
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Then("El cliente podra observar un mensaje de respuesta exitosa")
    public void elClientePodraObservarUnMensajeDeRespuestaExitosa() {


    }
    @When("El cliente ingresa sus datos personales pero olvido enviar el mensaje de requerimiento")
    public void elClienteIngresaSusDatosPersonalesPeroOlvidoEnviarElMensajeDeRequerimiento() {


    }
    @Then("El cliente podra observar un mensaje de advertencia como respuesta erronea")
    public void elClientePodraObservarUnMensajeDeAdvertenciaComoRespuestaErronea() {


    }

}
