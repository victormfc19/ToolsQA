package co.com.practica.toolsqa.tasks;

import co.com.practica.toolsqa.userinterfaces.HomeUI;
import co.com.practica.toolsqa.userinterfaces.WidgetsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Alerts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.WIDGETS_ICON),
                Click.on(WidgetsUI.ALERT_BUTTON),
                Click.on(WidgetsUI.BROWSER_WINDOWS_BUTTON)
        );
    }

    public static Alerts openWidgets(){
        return new Alerts();
    }
}
