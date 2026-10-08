package pa.com.compra.screenplay.cert.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import pa.com.compra.screenplay.cert.tasks.AgregarProductos;

public class PaginaProductos {

    public static final Target Boton_Jacket = Target.the("Sauce Labs Fleece Jacket")
            .locatedBy("//img[@data-test='inventory-item-sauce-labs-fleece-jacket-img']");

    public static final Target Boton_agregar = Target.the("Boton add to card")
            .locatedBy("//button[@id='add-to-cart']");

    public static final Target Boton_carrito = Target.the("Boton carrito")
            .locatedBy("//a[@data-test='shopping-cart-link']");
}
