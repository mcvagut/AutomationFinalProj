package tasks.register;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.RegisterTypeSelection;

public class SelectRegisterTypeForm {
    public static void perform(WebDriver driver) {
        Click.on(driver, RegisterTypeSelection.registerAsUser);
    }

}
