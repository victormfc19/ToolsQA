package co.com.practica.toolsqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target ELEMENTS_ICON = Target.the("Icon of element")
            .locatedBy("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]");
}
