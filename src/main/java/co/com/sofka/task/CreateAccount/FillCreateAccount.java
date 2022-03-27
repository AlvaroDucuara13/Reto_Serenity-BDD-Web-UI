package co.com.sofka.task.CreateAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userinterface.CreateAccountForm.CreateAccountForm.*;

public class FillCreateAccount implements Task {
    private String customerFirstName;
    private String customerLastName;
    private String Password;
    private String DayBird;
    private String MonthBird;
    private String YearBird;
    private String FirstNameAddress;
    private String LastNameAddress;
    private String Address;
    private String City;
    private String State;
    private String ZipCode;
    private String ZipCodeError;
    private String Country;
    private String MobilePhone;
    private String AddressAlias;
    private String Email;



    public FillCreateAccount UsingEmail(String email) {
        this.Email = email;
        return this;
    }

    public FillCreateAccount andCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
        return this;
    }

    public FillCreateAccount andCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
        return this;
    }

    public FillCreateAccount andPassword(String password) {
        this.Password = password;
        return this;
    }

    public FillCreateAccount andDayBird(String dayBird) {
        this.DayBird = dayBird;
        return this;
    }

    public FillCreateAccount andMonthBird(String monthBird) {
        this.MonthBird = monthBird;
        return this;
    }
    public FillCreateAccount andYearBird(String yearBird) {
        this.YearBird = yearBird;
        return this;
    }

    public FillCreateAccount AndFirstNameAddress(String NameAddress) {
        this.FirstNameAddress = NameAddress;
        return this;
    }

    public FillCreateAccount AndLastNameAddress(String LastNameAddres) {
        this.LastNameAddress = LastNameAddres;
        return this;
    }
    public FillCreateAccount andAddress(String address) {
        this.Address = address;
        return this;
    }

    public FillCreateAccount andCity(String city) {
        this.City = city;
        return this;
    }
    public FillCreateAccount andState(String state) {
        this.State = state;
        return this;
    }

    public FillCreateAccount andPostalcode(String postalcode) {
        this.ZipCode = postalcode;
        return this;
    }

    public FillCreateAccount andCountry(String country) {
        this.Country = country;
        return this;
    }


    public FillCreateAccount andMobilephone(String mobilephone) {
        this.MobilePhone = mobilephone;
        return this;
    }

    public FillCreateAccount andAddressalias(String addressalias) {
        this.AddressAlias = addressalias;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(


                Scroll.to(EmailSignin),
                Enter.theValue(Email).into(EmailSignin),
                Scroll.to(CreateSubmit),
                Click.on(CreateSubmit),

                Scroll.to(FirstNameCustomer),
                Enter.theValue(customerFirstName).into(FirstNameCustomer),

                Scroll.to(LastNameCustomer),
                Enter.theValue(customerLastName).into(LastNameCustomer),

                Scroll.to(PasswordCreateAccount),
                Enter.theValue(Password).into(PasswordCreateAccount),

              Scroll.to(DayBirdAccount),
                SelectFromOptions.byValue(DayBird).from(DayBirdAccount),

                Scroll.to(MonthBirdAccount),
                SelectFromOptions.byValue(MonthBird).from(MonthBirdAccount),

                Scroll.to(YearBirdAccount),
                SelectFromOptions.byValue(YearBird).from(YearBirdAccount),


                Scroll.to(FirstNameAddressAccount),
                Enter.theValue(FirstNameAddress).into(FirstNameAddressAccount),

                Scroll.to(LastNameAddressAccount),
                Enter.theValue(LastNameAddress).into(LastNameAddressAccount),


                Scroll.to(AddressAccount),
                Enter.theValue(Address).into(AddressAccount),

                Scroll.to(CityAccount),
                Enter.theValue(City).into(CityAccount),

                Scroll.to(StateAccount),
                SelectFromOptions.byVisibleText(State).from(StateAccount),

                Scroll.to(ZipCodeAccount),
                Enter.theValue(ZipCode).into(ZipCodeAccount),


                Scroll.to(MobilePhoneAccount),
                Enter.theValue(MobilePhone).into(MobilePhoneAccount),

                Scroll.to(AliasAccount),
                Enter.theValue(AddressAlias).into(AliasAccount),

                Scroll.to(AccountSubmit),
                Click.on(AccountSubmit)
        );

    }
    public static FillCreateAccount fillCreateAccount(){
        return new FillCreateAccount();
    }
}
