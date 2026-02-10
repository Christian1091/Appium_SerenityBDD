package test.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.prueba.interfaces.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {

    private final String username;
    private final String password;

    public LoginTask (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginTask login(String username, String password) {
        return new LoginTask(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            // Pequeña espera inicial para que la pantalla de login cargue
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(

                WaitUntil.the(LoginPage.txtUsername, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(username).into(LoginPage.txtUsername),

                WaitUntil.the(LoginPage.txtPassword, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(password).into(LoginPage.txtPassword)
        );
    }
}
