package tasks.login;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginFormUI;
import ui.RegisterFormUI;

public class FillLoginForm {
    public static void perform(WebDriver driver, String username, String password) throws Exception {

        Enter.text(driver, LoginFormUI.usernameTxt, username);
        Enter.text(driver, LoginFormUI.passwordTxt, password);

        Click.on(driver, LoginFormUI.loginBtn);
        //ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}

