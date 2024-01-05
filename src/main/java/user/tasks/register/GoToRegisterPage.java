package user.tasks.register;

import user.actions.Click;
import org.openqa.selenium.WebDriver;
import user.ui.LoginFormUI;



public class GoToRegisterPage {
    public static void perform(WebDriver driver) {
        Click.on(driver, LoginFormUI.registerNow);
    }

}
