package co.com.practica.toolsqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementsUI {
    public static final Target TEXTBOX_OPTION = Target.the("Option of textbox")
            .locatedBy("//li[@id='item-0']");
    public static final Target RADIO_BUTTON_OPTION = Target.the("Option of radio button")
            .located(By.id("item-2"));
}
