package co.com.practica.toolsqa.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WidgetsUI {
    public static final Target ALERT_BUTTON = Target.the("Button of alerts and widgets")
            .locatedBy("(//div[@class='header-text'])[3]");
    public static final Target BROWSER_WINDOWS_BUTTON = Target.the("Button of Browser")
            .locatedBy("//span[contains(text(),'Browser Windows')]");
    public static final Target NEW_WINDOW_BUTTON = Target.the("Button of new windows")
            .located(By.id("windowButton"));
}
