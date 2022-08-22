package co.com.choucair.certificacion.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/uTestRegister.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.retotecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}



