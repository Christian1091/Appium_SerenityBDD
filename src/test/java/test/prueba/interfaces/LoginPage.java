package test.prueba.interfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {

    /*Tener elementos para interectuar - No se tiene logica*/
    public static final Target txtUsername = Target.the("Ingresar Username")
            .located(AppiumBy.androidUIAutomator("new UiSelector().description(\"test-Username\")"));

    public static final Target txtPassword = Target.the("Ingresar Password")
            .located(AppiumBy.androidUIAutomator("new UiSelector().description(\"test-Password\")"));
}
