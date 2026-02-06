package test.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import test.prueba.interfaces.LoginPage;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Hola").into(LoginPage.txtUsername),
                Enter.theValue("Hola").into(LoginPage.txtPassword)
        );
    }
}
