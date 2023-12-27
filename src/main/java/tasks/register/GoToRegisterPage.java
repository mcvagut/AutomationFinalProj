package tasks.register;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.LoginFormUI;



public class GoToRegisterPage {
    public static void perform(WebDriver driver) {
        Click.on(driver, LoginFormUI.registerNow);
    }

}
