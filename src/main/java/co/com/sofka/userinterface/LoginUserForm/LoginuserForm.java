package co.com.sofka.userinterface.LoginUserForm;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class LoginuserForm extends PageObject {

    public static final Target LogInEmail = Target
            .the("LogInEmail")
            .located(xpath("//*[@id=\"email\"]"));

    public static final Target PasswordSignin = Target
            .the("PasswordSignin")
            .located(xpath("//*[@id=\"passwd\"]"));

    public static final Target SubmitSignin = Target
            .the("SubmitSignin")
            .located(xpath("//*[@id=\"SubmitLogin\"]/span"));

    public static final Target LogOutSignin = Target
            .the("SubmitSignin")
            .located(xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));


    public static final Target MessageError = Target
            .the("MessageError")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));


}
