package task;

import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.RegisterPage.*;

public class InputDataTask implements Task {

    private final UserData userData;

    public InputDataTask(UserData userData) {
        this.userData = userData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SINGUP_LOGIN),
                Enter.theValue(userData.getName()).into(NAME),
                Enter.theValue(userData.getEmail()).into(EMAIL),
                Click.on(SINGUP),
                WaitUntil.the(ENTER_ACCOUNT,isVisible()).forNoMoreThan(30).seconds(),
                CheckCheckbox.of(MR),
                Enter.theValue(userData.getPassword()).into(PASSWORD),
                SelectFromOptions.byValue("10").from(DAY),
                SelectFromOptions.byValue("2").from(MONTH),
                SelectFromOptions.byValue("2013").from(YEAR),
                Click.on(NEWSLETTER),
                Scroll.to(FIRSTNAME),
                Enter.theValue(userData.getFirstName()).into(FIRSTNAME),
                Enter.theValue(userData.getLastName()).into(LASTNAME),
                Enter.theValue(userData.getCompany()).into(COMPANY),
                Enter.theValue(userData.getAddress()).into(ADDRESS),
                Scroll.to(COUNTRY),
                SelectFromOptions.byValue("India").from(COUNTRY),
                Enter.theValue(userData.getState()).into(STATE),
                Enter.theValue(userData.getCity()).into(CITY),
                Enter.theValue(userData.getZipcode()).into(ZIPCODE),
                Enter.theValue(userData.getMobileNumber()).into(MOBILE),
                Click.on(CREATE)
        );

    }
    public static InputDataTask withData(UserData userData){
        return instrumented(InputDataTask.class,userData);
    }
}
