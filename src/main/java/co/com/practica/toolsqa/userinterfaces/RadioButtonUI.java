package co.com.practica.toolsqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RadioButtonUI {
    public static final Target SELECT_YES = Target.the("Option of YES")
            .locatedBy("//label[contains(text(),'Yes')]");
}
