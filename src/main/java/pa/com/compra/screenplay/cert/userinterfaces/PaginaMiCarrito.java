package pa.com.compra.screenplay.cert.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaMiCarrito {

    public static final Target Boton_menu = Target.the("Menu Principal")
            .locatedBy("//div[@id='menu_button_container']//button[@id='react-burger-menu-btn']");
    public static final Target Boton_Logout = Target.the("Menu Logout").
            locatedBy("//a[@data-test='logout-sidebar-link']");
}