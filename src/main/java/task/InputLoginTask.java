package task;

import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.LoginPage.*;
import static ui.RegisterPage.*;

public class InputLoginTask implements Task {

    private final UserData userData;

    public InputLoginTask(UserData userData) {
        this.userData = userData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SINGUP_LOGIN),
                Enter.keyValues(userData.getEmail()).into(LOGINE),
                Enter.keyValues(userData.getPassword()).into(PASSWORDI),
                Click.on(LOGIN)
        );
    }
    public static InputLoginTask withLogin(UserData userData){
        return instrumented(InputLoginTask.class,userData);
    }
}
