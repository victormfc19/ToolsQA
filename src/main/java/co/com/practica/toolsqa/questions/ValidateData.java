package co.com.practica.toolsqa.questions;
import co.com.practica.toolsqa.userinterfaces.TextboxUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateData implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TextboxUI.EMAIL_CONFIRMATION).viewedBy(actor).asString();
    }

    public static ValidateData validateData(){
        return new ValidateData();
    }
}
