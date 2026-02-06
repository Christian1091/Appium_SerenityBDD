package test.prueba.interfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {

    /*Tener elementos para interectuar - No se tiene logica*/
    public static final Target txtUsername = the("Ingresar Username")
            .located(AppiumBy.accessibilityId("test-Username"));

    public static final Target txtPassword = the("Ingresar Password")
            .located(AppiumBy.accessibilityId("test-Password"));
}
