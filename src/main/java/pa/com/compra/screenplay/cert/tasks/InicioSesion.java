package pa.com.compra.screenplay.cert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.compra.screenplay.cert.userinterfaces.Homepage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class InicioSesion implements Task {

    public static InicioSesion Boton_Login(){
        return Tasks.instrumented(InicioSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {

        Actor.attemptsTo(

                WaitUntil.the(Homepage.USERNAME,isVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue("standard_user").into(Homepage.USERNAME),
                WaitUntil.the(Homepage.PASSWORD,isVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue("secret_sauce").into(Homepage.PASSWORD),
                WaitUntil.the(Homepage.Boton_Login,isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(Homepage.Boton_Login)
        );

    }
}
