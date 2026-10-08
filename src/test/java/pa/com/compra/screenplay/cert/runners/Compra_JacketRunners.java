package pa.com.compra.screenplay.cert.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src\\test\\resources\\features\\compra_jacket.feature"},
        glue = "pa.com.compra.screenplay.cert.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@UserHistory=345677"
)
public class Compra_JacketRunners {
}