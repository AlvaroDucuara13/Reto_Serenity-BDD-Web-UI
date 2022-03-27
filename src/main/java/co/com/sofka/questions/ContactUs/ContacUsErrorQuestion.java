package co.com.sofka.questions.ContactUs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.ContactUsForm.ContactUsForm.ContactUsMessageError;


public class ContacUsErrorQuestion implements Question {

    private String ErrorValidation;

    public ContacUsErrorQuestion wasErrorValitadion(String MessageError) {
        this.ErrorValidation = MessageError;
        return this;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return (ContactUsMessageError.resolveFor(actor).containsOnlyText(ErrorValidation));
    }
    public static ContacUsErrorQuestion contacUsErrorQuestion(){
        return new ContacUsErrorQuestion();
    }

}
