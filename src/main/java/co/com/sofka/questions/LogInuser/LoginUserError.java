package co.com.sofka.questions.LogInuser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.LoginUserForm.LoginuserForm.MessageError;

public class LoginUserError implements Question {

    private String ErrorLoginUser;

    public LoginUserError wasErrorLogInUser(String validation) {
        this.ErrorLoginUser = validation;
        return this;

    }

    public static LoginUserError loginUserError(){
        return new LoginUserError();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return MessageError.resolveFor(actor).containsOnlyText(ErrorLoginUser);
    }
}
