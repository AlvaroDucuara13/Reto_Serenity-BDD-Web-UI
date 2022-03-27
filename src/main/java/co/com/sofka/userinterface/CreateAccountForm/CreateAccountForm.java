package co.com.sofka.userinterface.CreateAccountForm;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.cssSelector;

public class CreateAccountForm extends PageObject {

    public static final Target Signin = Target
            .the("Signin")
            .located(xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

    public static final Target EmailSignin= Target
            .the("EmailSignin")
            .located(xpath("//*[@i]d=\"email_create\""));

    public static final Target CreateSubmit = Target
            .the("CreateSubmit")
            .located(xpath("//*[@id=\"SubmitCreate\"]/span"));

    public static final Target FirstNameCustomer = Target
            .the("FirstNameCustomer")
            .located(xpath("//*[@id=\"customer_firstname\"]"));

    public static final Target LastNameCustomer = Target
            .the("LastNameCustomer")
            .located(xpath("//*[@id=\"customer_lastname\"]"));

    public static final Target PasswordCreateAccount = Target
            .the("PasswordCreateAccount")
            .located(xpath("//*[@id=\"passwd\"]"));

    public static final Target DayBird= Target
            .the("DayBird")
            .located(cssSelector("#days :nth-child(10)"));

    public static final Target MonthBird= Target
            .the("MonthBird")
            .located(cssSelector("#months :nth-child(3)"));

    public static final Target YearBird= Target
            .the("YearBird")
            .located(cssSelector("#years :nth-child(25)"));

    public static final Target FirstNameAddress= Target
            .the("FirstName")
            .located(xpath("//*[@id=\"firstname\"]"));

    public static final Target LastNameAddress= Target
            .the("LastName")
            .located(xpath("//*[@id=\"lastname\"]"));

    public static final Target Address= Target
            .the("Address")
            .located(xpath("//*[@id=\"address1\"]"));

    public static final Target City= Target
            .the("City")
            .located(xpath("//*[@id=\"city\"]"));

    public static final Target State= Target
            .the("State")
            .located(cssSelector("#id_state :nth-child(10)"));

    public static final Target ZipCode= Target
            .the("ZipPostalCode")
            .located(xpath("//*[@id=\"postcode\"]"));

    public static final Target Country= Target
            .the("CountryName")
            .located(xpath("//*[@id=\"id_country\"]"));


    public static final Target MobilePhone= Target
            .the("MobilePhone")
            .located(xpath("//*[@id=\"phone_mobile\"]"));

    public static final Target Alias= Target
            .the("AddressAlias")
            .located(xpath("//*[@id=\"alias\"]"));

    public static final Target AccountSubmit= Target
            .the("AccountSubmit")
            .located(xpath("//*[@id=\"submitAccount\"]/span"));


    public static final Target validationAccount = Target
            .the("validationAccount")
            .located(cssSelector(".account :nth-child(1)"));

    public static final Target MessageError = Target
            .the("MessageError")
            .located(xpath("//*[@id=\"center_column\"]/div/ol/li"));







}
