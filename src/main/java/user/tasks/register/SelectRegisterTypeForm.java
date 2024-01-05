package user.tasks.register;

import user.actions.Click;
import org.openqa.selenium.WebDriver;
import user.ui.RegisterTypeSelection;

public class SelectRegisterTypeForm {
    public static void perform(WebDriver driver) {
        Click.on(driver, RegisterTypeSelection.registerAsUser);
    }

}
