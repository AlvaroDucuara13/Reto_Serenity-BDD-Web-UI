package co.com.sofka.stepdefinition.step;

import co.com.sofka.models.datosRandomModel.DatosModelRandom;
import co.com.sofka.stepdefinition.setup.Setup;
import co.com.sofka.task.LoginUser.FillLoginUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static co.com.sofka.task.CreateAccount.BrowserToCreateAccount.browserToCreateAccount;
import static co.com.sofka.task.CreateAccount.FillCreateAccount.fillCreateAccount;
import static co.com.sofka.task.LogOut.FillLogOut.fillLogOut;
import static co.com.sofka.task.LoginUser.FillLoginUser.fillLoginUser;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.util.DatosRandomPersona.generarPersonasRandom;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserStep extends Setup {

    private static final Logger LOGGER = Logger.getLogger(ContactUsStep.class);
    private static final String Actor = "AlvaroD";
    private static final String ValidationMessage = "MY ACCOUNT";
    private static final String ValidationMessageError = "The Zip/Postal code you've entered is invalid. It must follow this format: 00000";

    private DatosModelRandom random;

    @Given("El usuario se encuentra en la pagina web automationpractice.com listo para autenticarse")
    public void elUsuarioSeEncuentraEnLaPaginaWebAutomationpracticeComListoParaAutenticarse() {
        try {
            actorSetupTheBrowser(Actor);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()

            );

        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }

    }

    @When("El usuario ingresa su correo y su contraseña")
    public void elUsuarioIngresaSuCorreoYSuContraseña() {
        try {

            random = generarPersonasRandom();
            theActorInTheSpotlight().attemptsTo(
                    browserToCreateAccount(),
                    fillCreateAccount()
                            .UsingEmail(random.getEmail())
                            .andCustomerFirstName(random.getFirstName())
                            .andCustomerLastName(random.getLastName())
                            .andPassword(random.getPassword())
                            .andDayBird(random.getDayBird())
                            .andMonthBird(random.getMonthBird())
                            .andYearBird(random.getYearBird())
                            .AndFirstNameAddress(random.getFirstName())
                            .AndLastNameAddress(random.getLastName())
                            .andAddress(random.getAddress())
                            .andCity(random.getCity())
                            .andState(random.getState())
                            .andPostalcode(random.getZipCode())
                            .andMobilephone(random.getMobilePhone())
                            .andAddressalias(random.getAddressAlias()),
                    fillLogOut(),
                    fillLoginUser()
                            .UsingEmailSignIn(random.getEmail())
                            .AndPasswordSignIn(random.getPassword())
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }

    }
    @Then("El usuario debera recibir un mensaje de confirmacion inicio de sesion como respuesta exitosa")
    public void elUsuarioDeberaRecibirUnMensajeDeConfirmacionInicioDeSesionComoRespuestaExitosa() {

    }

    @When("El usuario registra sus ingresa su correo pero no ingresa la contraseña")
    public void elUsuarioRegistraSusIngresaSuCorreoPeroNoIngresaLaContraseña() {

    }
    @Then("El usuario debera recibir un mensaje de error de campo vacio como respuesta no exitosa")
    public void elUsuarioDeberaRecibirUnMensajeDeErrorDeCampoVacioComoRespuestaNoExitosa() {

    }

}
