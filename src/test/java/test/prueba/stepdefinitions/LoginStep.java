package test.prueba.stepdefinitions;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import test.prueba.tasks.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginStep {

    @BeforeEach
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Test
    public void insertCredencial() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Pepito")
                .attemptsTo(
                        LoginTask.login("standard_user", "secret_sauce")
                );
    }
}
