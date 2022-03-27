package co.com.sofka.questions.CreateAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.CreateAccountForm.CreateAccountForm.MessageError;
import static co.com.sofka.userinterface.CreateAccountForm.CreateAccountForm.validationAccount;


public class CreateAccountErrorQuestion implements Question {
    private String validationCreateAccountError;

    public CreateAccountErrorQuestion wasValidationCreateAccount(String validationError) {
        this.validationCreateAccountError = validationError;
        return this;

    }
        public static CreateAccountErrorQuestion createAccountErrorQuestion(){
            return new CreateAccountErrorQuestion();
        }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MessageError.resolveFor(actor).containsOnlyText(validationCreateAccountError);
    }
}
