package user.tasks.login;

import user.actions.Click;
import user.actions.Enter;
import com.aventstack.extentreports.Status;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.LoginFormUI;

public class FillLoginForm {
    public static void perform(WebDriver driver, String username, String password) throws Exception {

        Enter.text(driver, LoginFormUI.usernameTxt, username);
        Enter.text(driver, LoginFormUI.passwordTxt, password);

        Click.on(driver, LoginFormUI.loginBtn);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}

