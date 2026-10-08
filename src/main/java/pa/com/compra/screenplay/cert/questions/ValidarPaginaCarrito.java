package pa.com.compra.screenplay.cert.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;
import pa.com.compra.screenplay.cert.userinterfaces.PaginaMiCarrito;

public class ValidarPaginaCarrito implements Question<String> {

    public static ValidarPaginaCarrito Visible(){

        return new ValidarPaginaCarrito();

    }

    @Override
    public String answeredBy(Actor actor) {
        return Value.of(PaginaMiCarrito.Boton_menu).answeredBy(actor).toString();
    }
}
