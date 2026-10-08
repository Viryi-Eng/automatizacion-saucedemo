package pa.com.compra.screenplay.cert.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class PaginaMenu {

    public static final Target Boton_Logout= Target.the("Pagina Principal")
            .locatedBy("//a[@data-test='logout-sidebar-link']");

}