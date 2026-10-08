package pa.com.compra.screenplay.cert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.compra.screenplay.cert.userinterfaces.PaginaMenu;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class PaginaPrincipal implements Task {

    public static PaginaPrincipal Boton_Logout(){
        return Tasks.instrumented(PaginaPrincipal.class);
    }

    public static String answeredBy(Actor actor) {
        return Tasks.instrumented(VerificarProductos.class).toString();
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {

        Actor.attemptsTo(

                WaitUntil.the(PaginaMenu.Boton_Logout,isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(PaginaMenu.Boton_Logout));
                WaitUntil.the(PaginaMenu.Boton_Logout,isVisible()).forNoMoreThan(60).seconds();


    }
}