package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.ContactUsForm.ContactUsForm.ContactUsMessageError;


public class ContacUsErrorQuestion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (ContactUsMessageError.resolveFor(actor).containsOnlyText("The message cannot be blank."));
    }
    public static ContacUsErrorQuestion contacUsErrorQuestion(){
        return new ContacUsErrorQuestion();
    }

}
