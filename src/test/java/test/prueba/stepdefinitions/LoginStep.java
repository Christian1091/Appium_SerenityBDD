package test.prueba.stepdefinitions;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginStep {

    /*@Test
    public void insertCredencial() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Pepito").attemptsTo(
                SendKeys.of("")
        );
    }*/
}
