package co.com.sofka.util;

import co.com.sofka.models.datosRandomModel.DatosModelRandom;
import com.github.javafaker.Faker;

public class DatosRandomPersona {

    private static DatosModelRandom random;
    private static Faker DatosRandom;
    private static String PostId;
    private static String FirstName;
    private static String LastName;
    private static String FullName;
    private static String Email;
    private static String Message;
    private static String OrderReference;



    public static DatosModelRandom generarPersonasRandom(){
        //Datos Random
        DatosRandom = new Faker();
        PostId = String.valueOf(DatosRandom.number().numberBetween(00,99));
        FirstName = DatosRandom.name().firstName();
        LastName = DatosRandom.name().lastName();
        FullName = FirstName +" "+ LastName;

        OrderReference = "Deseo Pedir la referencia del administrador";
        Email =  FirstName + "@outlook.com";
        Message = "Hola, deseo contactarrme con el gerente";



        random = new DatosModelRandom();
        random.setEmail(Email);
        random.setOrderReference(OrderReference);
        random.setMessage(Message);

        return random;
    }
}
