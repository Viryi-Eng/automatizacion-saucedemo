package pa.com.compra.screenplay.cert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.compra.screenplay.cert.userinterfaces.PaginaProductos;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AgregarProductos implements Task {

    public static AgregarProductos Boton_Agregar(){
        return Tasks.instrumented(AgregarProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {

        Actor.attemptsTo(

                WaitUntil.the(PaginaProductos.Boton_agregar,isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(PaginaProductos.Boton_agregar)
        );

    }
}