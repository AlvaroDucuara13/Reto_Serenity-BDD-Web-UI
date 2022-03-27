package co.com.sofka.userinterface.CreateAccountForm;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;


public class CreateAccountForm extends PageObject {

    public static final Target Signin = Target
            .the("Signin")
            .located(xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

    public static final Target EmailSignin= Target
            .the("EmailSignin")
            .located(xpath("//*[@id=\"email_create\"]"));

    public static final Target CreateSubmit = Target
            .the("Create an account button")
            .located(xpath("//*[@id=\"SubmitCreate\"]"));

    public static final Target FirstNameCustomer = Target
            .the("CustomerFirstName")
            .located(xpath("//*[@id=\"customer_firstname\"]"));

    public static final Target LastNameCustomer = Target
            .the("LastNameCustomer")
            .located(xpath("//*[@id=\"customer_lastname\"]"));

    public static final Target PasswordCreateAccount = Target
            .the("PasswordCreateAccount")
            .located(xpath("//*[@id=\"passwd\"]"));

    public static final Target DayBirdAccount = Target
            .the("DayBird")
            .located(xpath("//*[@id=\"days\"]"));

    public static final Target MonthBirdAccount = Target
            .the("MonthBird")
            .located(xpath("//*[@id=\"months\"]"));

    public static final Target YearBirdAccount = Target
            .the("YearBird")
            .located(xpath("//*[@id=\"years\"]"));

    public static final Target FirstNameAddressAccount = Target
            .the("FirstName")
            .located(xpath("//*[@id=\"firstname\"]"));

    public static final Target LastNameAddressAccount = Target
            .the("LastName")
            .located(xpath("//*[@id=\"lastname\"]"));

    public static final Target AddressAccount = Target
            .the("Address")
            .located(xpath("//*[@id=\"address1\"]"));

    public static final Target CityAccount = Target
            .the("City")
            .located(xpath("//*[@id=\"city\"]"));

    public static final Target StateAccount = Target
            .the("State")
            .located(xpath("//*[@id=\"id_state\"]"));

    public static final Target ZipCodeAccount = Target
            .the("ZipPostalCode")
            .located(xpath("//*[@id=\"postcode\"]"));

    public static final Target CountryAccount = Target
            .the("CountryName")
            .located(xpath("//*[@id=\"id_country\"]"));


    public static final Target MobilePhoneAccount = Target
            .the("MobilePhone")
            .located(xpath("//*[@id=\"phone_mobile\"]"));

    public static final Target AliasAccount = Target
            .the("AddressAlias")
            .located(xpath("//*[@id=\"alias\"]"));

    public static final Target AccountSubmit= Target
            .the("AccountSubmit")
            .located(xpath("//*[@id=\"submitAccount\"]/span"));


    public static final Target validationAccount = Target
            .the("validationAccount")
            .located(xpath("//*[@id=\"center_column\"]/h1"));

    public static final Target MessageError = Target
            .the("MessageError")
            .located(xpath("//*[@id=\"center_column\"]/div/ol/li"));







}
