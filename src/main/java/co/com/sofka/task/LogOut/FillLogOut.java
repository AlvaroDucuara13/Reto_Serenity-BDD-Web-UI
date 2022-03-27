package co.com.sofka.task.LogOut;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterface.CreateAccountForm.CreateAccountForm.validationAccount;
import static co.com.sofka.userinterface.LoginUserForm.LoginuserForm.LogOutSignin;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillLogOut implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(validationAccount, isVisible()),

                Scroll.to(LogOutSignin),
                Click.on(LogOutSignin)
        );
    }

    public static FillLogOut fillLogOut(){
        return new FillLogOut();
    }
}
