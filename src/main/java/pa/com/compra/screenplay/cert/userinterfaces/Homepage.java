package pa.com.compra.screenplay.cert.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Homepage {

    public static final Target USERNAME = Target.the("User name")
            .locatedBy("//input[@id=\"user-name\"]");

    public static final Target PASSWORD = Target.the("Password")
            .locatedBy("//input[@id=\"password\"]");

    public static final Target Boton_Login = Target.the("Boton_Login")
            .locatedBy("//*[@id=\"login-button\"]");
}

