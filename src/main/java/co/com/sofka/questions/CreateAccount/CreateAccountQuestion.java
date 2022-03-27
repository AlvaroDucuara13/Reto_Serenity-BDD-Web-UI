package co.com.sofka.questions.CreateAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.CreateAccountForm.CreateAccountForm.validationAccount;


public class CreateAccountQuestion implements Question {
    private String validationCreateAccount;

    public CreateAccountQuestion wasValidationCreateAccount(String validation) {
        this.validationCreateAccount = validation;
        return this;

    }
        public static CreateAccountQuestion createAccountQuestion(){
            return new CreateAccountQuestion();
        }

    @Override
    public Boolean answeredBy(Actor actor) {
        return validationAccount.resolveFor(actor).containsOnlyText(validationCreateAccount);
    }
}
