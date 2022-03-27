package co.com.sofka.stepdefinition.step;

import co.com.sofka.models.datosRandomModel.DatosModelRandom;
import co.com.sofka.stepdefinition.setup.Setup;
import co.com.sofka.task.CreateAccount.FillCreateAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static co.com.sofka.task.ContacUs.BrowserToContactUs.browseToContacUs;
import static co.com.sofka.task.ContacUs.FillContactUsForm.fillContactUsForm;
import static co.com.sofka.task.CreateAccount.BrowserToCreateAccount.browserToCreateAccount;
import static co.com.sofka.task.CreateAccount.FillCreateAccount.fillCreateAccount;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.util.ConstantsKey.WEBMASTER;
import static co.com.sofka.util.DatosRandomPersona.generarPersonasRandom;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateAccountStep extends Setup {
    private static final Logger LOGGER = Logger.getLogger(ContactUsStep.class);
    private static final String Actor = "AlvaroD";
    private DatosModelRandom random;

    @Given("El usuario se encuentra en la pagina web automationpractice.com")
    public void elUsuarioSeEncuentraEnLaPaginaWebAutomationpracticeCom() {

        try {
            actorSetupTheBrowser(Actor);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()

            );

        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }

    }


    @When("El usuario ingresa su correo y luego registra toda su informacion")
    public void elUsuarioIngresaSuCorreoYLuegoRegistraTodaSuInformacion() {
        try {

            random = generarPersonasRandom();
            theActorInTheSpotlight().attemptsTo(
                    browserToCreateAccount(),
                    fillCreateAccount()
                            .UsingEmail(random.getEmail())
                            .andCustomerFirstName(random.getFirstName())
                            .andCustomerLastName(random.getLastName())
                            .andPassword(random.getPassword())
                          /*  .andDayBird(random.getDayBird())
                            .andMonthBird(random.getMonthBird())
                            .andYearBird(random.getYearBird())*/
                            .AndFirstNameAddress(random.getFirstName())
                            .AndLastNameAddress(random.getLastName())
                            .andAddress(random.getAddress())
                            .andCity(random.getCity())
                           /* .andState(random.getState())*/
                            .andPostalcode(random.getZipCode())
                            .andCountry("United States")
                            .andMobilephone(random.getMobilePhone())
                            .andAddressalias(random.getAddressAlias())
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }

    }
    @Then("El usuario podra observar un mensaje de respuesta exitosa")
    public void elUsuarioPodraObservarUnMensajeDeRespuestaExitosa() {

    }

    @When("El usuario registra sus datos personales pero ingreso un formato invalido en ZipCode")
    public void elUsuarioRegistraSusDatosPersonalesPeroIngresoUnFormatoInvalidoEnZipCode() {

    }
    @Then("El usuario podra observar un mensaje de error como respuesta no exitosa")
    public void elUsuarioPodraObservarUnMensajeDeErrorComoRespuestaNoExitosa() {

    }
}
