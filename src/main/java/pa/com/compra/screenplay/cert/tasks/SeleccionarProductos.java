package pa.com.compra.screenplay.cert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.compra.screenplay.cert.userinterfaces.PaginaProductos;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SeleccionarProductos implements Task {

    public static SeleccionarProductos Boton_Jacket(){
        return Tasks.instrumented(SeleccionarProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {

        Actor.attemptsTo(

                WaitUntil.the(PaginaProductos.Boton_Jacket,isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(PaginaProductos.Boton_Jacket));

    }
}