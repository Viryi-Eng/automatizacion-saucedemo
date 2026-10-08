package pa.com.compra.screenplay.cert.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.compra.screenplay.cert.tasks.*;


public class Compra_Jacketstepsdefinitions {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("actor");
    }

    @Dado("que el usuario ingresa a la pagina web saucedemo")
    public void queElUsuarioIngresaALaPaginaWebSaucedemo() {

        OnStage.theActor( "actor").wasAbleTo(AbrirNavegador.paginaprincipal());

    }
    @Cuando("el usuario inicia sesion correctamente")
    public void elUsuarioIniciaSesionCorrectamente() {

        OnStage.theActor("actor").attemptsTo(InicioSesion.Boton_Login());

    }
    @Cuando("selecciona el producto Sauce Labs Fleece Jacket")
    public void seleccionaElProductoSauceLabsFleeceJacket() {

        OnStage.theActor("actor").attemptsTo(SeleccionarProductos.Boton_Jacket());

    }
    @Cuando("agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {

        OnStage.theActor("actor").attemptsTo(AgregarProductos.Boton_Agregar());

    }
    @Cuando("verifica el producto en el carrito")
    public void verificaElProductoEnElCarrito() {

        OnStage.theActor("actor").attemptsTo(VerificarProductos.Boton_carrito());

    }
    @Cuando("realiza click en el menu principal")
    public void realizaClickEnElMenuPrincipal() {

        OnStage.theActor("actor").attemptsTo(MenuPrincipal.Menu());

    }
    @Entonces("la compra debe estar añadido correctamente y salir a la pagina principal")
    public void laCompraDebeEstarAñadidoCorrectamenteYSalirALaPaginaPrincipal() {

        OnStage.theActor("actor").attemptsTo(PaginaPrincipal.Boton_Logout());


    }

}
