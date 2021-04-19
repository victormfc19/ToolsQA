package co.com.practica.toolsqa.questions;

import co.com.practica.toolsqa.userinterfaces.WidgetsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateWidget implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(WidgetsUI.ALERT_BUTTON).viewedBy(actor).asBoolean();
    }

    public static ValidateWidget button(){
        return new ValidateWidget();
    }
}
