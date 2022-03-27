package co.com.sofka.stepdefinition.step;

import co.com.sofka.models.datosRandomModel.DatosModelRandom;
import co.com.sofka.stepdefinition.setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;


import static co.com.sofka.questions.ContactUs.ContacUsErrorQuestion.contacUsErrorQuestion;
import static co.com.sofka.questions.ContactUs.ContactUsValidationQuestion.contactUsQuestion;
import static co.com.sofka.task.ContacUs.BrowserToContactUs.browseToContacUs;
import static co.com.sofka.task.ContacUs.FillContactUsForm.fillContactUsForm;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.util.DatosRandomPersona.generarPersonasRandom;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ContactUsStep extends Setup {
    private static final Logger LOGGER = Logger.getLogger(ContactUsStep.class);
    private static final String Actor = "AlvaroD";
    private static final String CUSTOMERSERVICE = "Customer service";
    private static final String WEBMASTER = "Webmaster";
    private static final String MESSAGEERROR = "The message cannot be blank.The message cannot be blank.";
    private  DatosModelRandom random;

    @Given("El cliente se encuentra en la plataforma web automationpractice.com")
    public void elClienteSeEncuentraEnLaPlataformaWebAutomationpracticeCom() {
        try {
            actorSetupTheBrowser(Actor);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()

            );

        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }



    }

    @When("El cliente ingresa sus datos personales y su mensaje de requerimiento")
    public void elClienteIngresaSusDatosPersonalesYSuMensajeDeRequerimiento() {
        try {

            random = generarPersonasRandom();
            theActorInTheSpotlight().attemptsTo(
                    browseToContacUs(),
                    fillContactUsForm()
                            .UsingHeading(WEBMASTER)
                            .UsingEmail(random.getEmail())
                            .UsingOrderReference(random.getOrderReference())
                            .AndUSingMessage(random.getMessage())
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }

    }
    @Then("El cliente podra observar un mensaje de respuesta exitosa")
    public void elClientePodraObservarUnMensajeDeRespuestaExitosa() {
        try {

            theActorInTheSpotlight().should(
                    seeThat(
                            contactUsQuestion(),equalTo(true)
                    )
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }

    }
    @When("El cliente ingresa sus datos personales pero olvido enviar el mensaje de requerimiento")
    public void elClienteIngresaSusDatosPersonalesPeroOlvidoEnviarElMensajeDeRequerimiento() {

        try {
            random = generarPersonasRandom();
            theActorInTheSpotlight().attemptsTo(
                    browseToContacUs(),
                    fillContactUsForm()
                            .UsingHeading(CUSTOMERSERVICE)
                            .UsingEmail(random.getEmail())
                            .UsingOrderReference(random.getOrderReference())
                            .AndUSingMessage("")
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }



    }
    @Then("El cliente podra observar un mensaje de advertencia como respuesta erronea")
    public void elClientePodraObservarUnMensajeDeAdvertenciaComoRespuestaErronea() {
        try {

            seeThat(
                    contacUsErrorQuestion().wasErrorValitadion(MESSAGEERROR),equalTo(true)
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }



    }

}
