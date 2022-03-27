package co.com.sofka.util;

import co.com.sofka.models.datosRandomModel.DatosModelRandom;
import com.github.javafaker.Faker;

public class DatosRandomPersona {

    private static DatosModelRandom random;
    private static Faker DatosRandom;

    private static String FirstName;
    private static String LastName;
    private static String Password;
    private static String DayBird;
    private static String MonthBird;
    private static String YearBird;
    private static String Address;
    private static String City;
    private static String State;
    private static String ZipCode;
    private static String ZipCodeError;
    private static String Country;
    private static String MobilePhone;
    private static String AddressAlias;

    private static String Email;
    private static String Message;
    private static String OrderReference;



    public static DatosModelRandom generarPersonasRandom(){
        //Datos Random
        DatosRandom = new Faker();
       // PostId = String.valueOf(DatosRandom.number().numberBetween(00,99));
        FirstName = DatosRandom.name().firstName();
        LastName = DatosRandom.name().lastName();
        Password =ZipCode + FirstName;
        DayBird = String.valueOf(DatosRandom.number().numberBetween(1,30));
        MonthBird = String.valueOf(DatosRandom.number().numberBetween(1,12));
        YearBird = String.valueOf(DatosRandom.number().numberBetween(1900,2022));
        Address = DatosRandom.address().fullAddress();
        City = DatosRandom.address().cityName();
        State = DatosRandom.address().state();
        ZipCode=String.valueOf(DatosRandom.number().numberBetween(00000,99999));
        ZipCodeError = DatosRandom.address().zipCode();
        Country = DatosRandom.address().country();
        MobilePhone = DatosRandom.phoneNumber().cellPhone();
        AddressAlias=FirstName+" "+City;
        OrderReference = "Deseo Pedir la referencia del administrador";
        Email =  FirstName + "@outlook.com";
        Message = "Hola, deseo contactarrme con el gerente";



        random = new DatosModelRandom();
        random.setFirstName(FirstName);
        random.setLastName(LastName);
        random.setPassword(Password);
        random.setDayBird(DayBird);
        random.setMonthBird(MonthBird);
        random.setYearBird(YearBird);
        random.setAddress(Address);
        random.setCity(City);
        random.setState(State);
        random.setZipCode(ZipCode);
        random.setZipCodeError(ZipCodeError);
        random.setMobilePhone(MobilePhone);
        random.setAddressAlias(AddressAlias);
        random.setEmail(Email);
        random.setOrderReference(OrderReference);
        random.setMessage(Message);

        return random;
    }
}
