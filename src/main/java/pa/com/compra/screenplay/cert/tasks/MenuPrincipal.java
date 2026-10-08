package pa.com.compra.screenplay.cert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.compra.screenplay.cert.userinterfaces.PaginaMiCarrito;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class MenuPrincipal implements Task {

    public static MenuPrincipal Menu(){
        return Tasks.instrumented(MenuPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {

        Actor.attemptsTo(

                WaitUntil.the(PaginaMiCarrito.Boton_menu,isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(PaginaMiCarrito.Boton_menu));


    }
}