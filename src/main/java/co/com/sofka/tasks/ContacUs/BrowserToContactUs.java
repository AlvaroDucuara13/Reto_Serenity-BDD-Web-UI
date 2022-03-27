package co.com.sofka.tasks.ContacUs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.ContactUsForm.ContactUsForm.ContactUs;

public class BrowserToContactUs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ContactUs),
                Click.on(ContactUs)
        );

    }
    public static BrowserToContactUs browseToContacUs(){
        return new BrowserToContactUs();
    }
}
