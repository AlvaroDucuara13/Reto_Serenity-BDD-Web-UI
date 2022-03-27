package co.com.sofka.questions.ContactUs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterface.ContactUsForm.ContactUsForm.ContactUsValidation;

public class ContactUsValidationQuestion implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return (ContactUsValidation.resolveFor(actor).containsOnlyText("Your message has been successfully sent to our team."));
    }

    public static ContactUsValidationQuestion contactUsQuestion(){
        return new ContactUsValidationQuestion();
    }


}
