package co.com.sofka.task.CreateAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterface.CreateAccountForm.CreateAccountForm.*;
import static co.com.sofka.userinterface.CreateAccountForm.CreateAccountForm.CreateSubmit;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BrowserToCreateAccount implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(Signin),
                Click.on(Signin)

                        );
    }

    public static BrowserToCreateAccount browserToCreateAccount(){
        return new BrowserToCreateAccount();
    }
}
