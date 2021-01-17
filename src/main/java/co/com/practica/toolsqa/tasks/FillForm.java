package co.com.practica.toolsqa.tasks;

import co.com.practica.toolsqa.interactions.Wait;
import co.com.practica.toolsqa.userinterfaces.ElementsUI;
import co.com.practica.toolsqa.userinterfaces.HomeUI;
import co.com.practica.toolsqa.userinterfaces.TextboxUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class FillForm implements Task {

    private List<Map<String, String>> dataFields;

    public FillForm(List<Map<String, String>> dataFields) {
        this.dataFields = dataFields;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeUI.ELEMENTS_ICON),
                Click.on(ElementsUI.TEXTBOX_OPTION),
                Enter.theValue(dataFields.get(1).get("fullname")).into(TextboxUI.FULLNAME_TEXTBOX),
                Enter.theValue(dataFields.get(1).get("email")).into(TextboxUI.EMAIL_TEXTBOX),
                Enter.theValue(dataFields.get(1).get("currentAddress")).into(TextboxUI.CURRENT_ADDRESS_TEXTBOX),
                Enter.theValue(dataFields.get(1).get("permanentAddress")).into(TextboxUI.PERMANENT_ADDRESS_TEXTBOX),
                Click.on(TextboxUI.SUBMIT_BUTTON),
                Wait.theSeconds(2)
                );
    }

    public static FillForm completeData(List<Map<String, String>> dataFields){
        return instrumented(FillForm.class, dataFields);
    }
}
