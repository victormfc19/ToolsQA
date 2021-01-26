package co.com.practica.toolsqa.tasks;

import co.com.practica.toolsqa.userinterfaces.ElementsUI;
import co.com.practica.toolsqa.userinterfaces.HomeUI;
import co.com.practica.toolsqa.userinterfaces.RadioButtonUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class RadioButtonSelect implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeUI.ELEMENTS_ICON),
                Click.on(ElementsUI.RADIO_BUTTON_OPTION),
                Click.on(RadioButtonUI.SELECT_YES)
                );
    }

    public static RadioButtonSelect select(){
        return new RadioButtonSelect();
    }
}
