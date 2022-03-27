package co.com.sofka.userinterface.ContactUsForm;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class ContactUsForm extends PageObject {
    public static final Target ContactUs = Target
            .the("ContactUs")
            .located(id("contact-link"));

    public static final Target SubjectHeading = Target
            .the("SubjectHeading")
            .located(xpath("//*[@id=\"id_contact\"]"));

    public static final Target CustomerService= Target
            .the("SubjectHeadingCustomerService")
            .located(xpath("//*[@id=\"id_contact\"]/option[2]"));

    public static final Target WebMaster = Target
            .the("SubjectHeadingOptionWebMaster")
            .located(xpath("//*[@id=\"id_contact\"]/option[3]"));

    public static final Target EmailAddress = Target
            .the("EmailAddress")
            .located(xpath("//*[@id=\"email\"]"));

    public static final Target OrderReference = Target
            .the("OrderReference")
            .located(id("id_order"));

    public static final Target Message = Target
            .the("Message")
            .located(xpath("//*[@id=\"message\"]"));

    public static final Target SubmitContacUs = Target
            .the("SubmitContacUs")
            .located(xpath("//*[@id=\"submitMessage\"]/span"));

    public static final Target ContactUsValidation= Target
            .the("ContactUsValidation")
            .located(xpath("//*[@id=\"center_column\"]/p"));

    public static final Target ContactUsMessageError = Target
            .the("MessageError ")
            .located(xpath("//*[@id=\"center_column\"]/div/ol"));

}
