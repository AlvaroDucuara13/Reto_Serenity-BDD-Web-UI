package co.com.sofka.questions.LogInuser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.CreateAccountForm.CreateAccountForm.validationAccount;

public class LoginUserQuestion implements Question {

    private String validationLoginUser;

    public LoginUserQuestion wasValidationLogInUser(String validation) {
        this.validationLoginUser = validation;
        return this;

    }
    public static LoginUserQuestion loginUserQuestion(){
        return new LoginUserQuestion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return validationAccount.resolveFor(actor).containsOnlyText(validationLoginUser);
    }
}
