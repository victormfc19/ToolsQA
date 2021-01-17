package co.com.practica.toolsqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ElementsUI {
    public static final Target TEXTBOX_OPTION = Target.the("Option of textbox")
            .locatedBy("//li[@id='item-0']");
}
