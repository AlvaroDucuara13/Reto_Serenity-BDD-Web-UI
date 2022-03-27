package co.com.sofka.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/CreateAccount.feature"},
        glue = {"co.com.sofka.stepdefinition.step"}
)

public class CreateAccountTest {
}
