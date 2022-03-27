package co.com.sofka.task.LoginUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofka.userinterface.LoginUserForm.LoginuserForm.*;



public class FillLoginUser implements Task {

    private String EmailLogin;
    private String PasswordLogin;

    public FillLoginUser UsingEmailSignIn(String emailLogin) {
        this.EmailLogin = emailLogin;
        return this;
    }

    public FillLoginUser AndPasswordSignIn(String passwordLogin) {
        this.PasswordLogin = passwordLogin;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(



                Scroll.to(LogInEmail),
                Enter.theValue(EmailLogin).into(LogInEmail),

                Scroll.to(PasswordSignin),
                Enter.theValue(PasswordLogin).into(PasswordSignin),

                Scroll.to(SubmitSignin),
                Click.on(SubmitSignin)


        );

    }

    public static FillLoginUser fillLoginUser(){
        return new FillLoginUser();
    }
}
