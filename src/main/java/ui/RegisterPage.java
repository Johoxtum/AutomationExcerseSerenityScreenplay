package ui;

import net.serenitybdd.screenplay.targets.Target;


public class RegisterPage {
    private RegisterPage() {}

    public static final Target SINGUP_LOGIN = Target.the("Boton registrar y ingresar")
            .locatedBy("//a[normalize-space()='Signup / Login']");
    public static final Target NAME = Target.the("Campo nombre")
            .locatedBy("//input[@placeholder='Name']");
    public static final Target EMAIL = Target.the("Campo email")
            .locatedBy("//input[@data-qa='signup-email']");

    public static final Target SINGUP = Target.the("Boton registrar")
            .locatedBy("//button[normalize-space()='Signup']");

    public static final Target ENTER_ACCOUNT = Target.the("Titulo Enter Account")
            .locatedBy("//b[normalize-space()='Enter Account Information']");

    public static final Target MR = Target.the("MR")
            .locatedBy("//input[@id='id_gender1']");
    public static final Target PASSWORD = Target.the("Contraseña")
            .locatedBy("//input[@id='password']");
    public static final Target DAY = Target.the("día")
            .locatedBy("#days");
    public static final Target MONTH = Target.the("Mes")
            .locatedBy("#months");
    public static final Target YEAR = Target.the("Año")
            .locatedBy("#years");
    public static final Target NEWSLETTER = Target.the("check noticias")
            .locatedBy("#newsletter");

    public static final Target FIRSTNAME = Target.the("Primer nombre")
            .locatedBy("#first_name");
    public static final Target LASTNAME = Target.the("Apellidos")
            .locatedBy("#last_name");
    public static final Target COMPANY = Target.the("Empresa")
            .locatedBy("#company");
    public static final Target ADDRESS = Target.the("dirección")
            .locatedBy("#address1");
    public static final Target COUNTRY = Target.the("Pais")
            .locatedBy("#country");
    public static final Target STATE = Target.the("Estado")
            .locatedBy("#state");
    public static final Target CITY = Target.the("Ciudad")
            .locatedBy("#city");
    public static final Target ZIPCODE = Target.the("codigo")
            .locatedBy("#zipcode");
    public static final Target MOBILE = Target.the("Numero de celular")
            .locatedBy("#mobile_number");
    public static final Target CREATE = Target.the("Botón crear cuenta")
            .locatedBy("//button[normalize-space()='Create Account']");

    public static final Target ACREATED = Target.the("Cuenta creada")
            .locatedBy("//b[normalize-space()='Account Created!']");



}
