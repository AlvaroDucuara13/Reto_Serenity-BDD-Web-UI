package co.com.sofka.tasks.ContacUs;

import co.com.sofka.userinterfaces.ContactUsForm.ContactUsForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userinterfaces.ContactUsForm.ContactUsForm.*;

public class FillContactUsForm implements Task {
    private String Email;
    private String Heading;
    private String DataOrderReference;
    private String DataMessage;

    public FillContactUsForm UsingEmail(String email) {
        this.Email = email;
        return this;
    }
    public FillContactUsForm UsingHeading(String heading) {
        this.Heading = heading;
        return this;
    }


    public FillContactUsForm UsingOrderReference(String orderReference) {
        this.DataOrderReference = orderReference;
        return this;
    }

    public FillContactUsForm AndUSingMessage(String message) {
        this.DataMessage = message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(SubjectHeading),
                Click.on(SubjectHeading),

                SelectFromOptions.byVisibleText(Heading).from(SubjectHeading),

                Scroll.to(EmailAddress),
                Enter.theValue(Email).into(EmailAddress),
                Scroll.to(ContactUsForm.OrderReference),
                Enter.theValue(DataOrderReference).into(ContactUsForm.OrderReference),
                Scroll.to(Message),
                Enter.theValue(DataMessage).into(Message)
        );
    }

    public static FillContactUsForm fillContactUsForm(){
        return new FillContactUsForm();
    }
}
