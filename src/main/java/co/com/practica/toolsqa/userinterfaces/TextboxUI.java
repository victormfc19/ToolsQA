package co.com.practica.toolsqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TextboxUI {

    public static final Target FULLNAME_TEXTBOX = Target.the("Textbox of fullname")
            .located(By.id("userName"));

    public static final Target EMAIL_TEXTBOX = Target.the("Textbox of email")
            .located(By.id("userEmail"));

    public static final Target CURRENT_ADDRESS_TEXTBOX = Target.the("Textbox of current address")
            .located(By.id("currentAddress"));

    public static final Target PERMANENT_ADDRESS_TEXTBOX = Target.the("Textbox of permanent address")
            .located(By.id("permanentAddress"));

    public static final Target SUBMIT_BUTTON = Target.the("Button of submit")
            .located(By.id("submit"));

    public static final Target EMAIL_CONFIRMATION = Target.the("Confirmation of data")
            .locatedBy("//p[@id='email']");
}
