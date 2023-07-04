package ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target LOGINE = Target.the("Email")
            .locatedBy("//input[@data-qa='login-email']");

    public static final Target PASSWORDI = Target.the("Contraseña ingreso")
            .locatedBy("//input[@placeholder='Password']");
    public static final Target LOGIN = Target.the("Botón ingreso")
            .locatedBy("//button[normalize-space()='Login']");

    public static final Target AUTOMATION = Target.the("Titulo ingreso")
            .locatedBy("//div[@class='item active']//span[1]");
}
