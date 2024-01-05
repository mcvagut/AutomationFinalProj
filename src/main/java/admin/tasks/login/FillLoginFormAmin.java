package admin.tasks.login;

import admin.actions.Click;
import admin.actions.Enter;
import admin.helpers.ScreenshotHelper;
import admin.ui.LoginFormUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

public class FillLoginFormAmin {
    public static void perform(WebDriver driver, String username, String password) throws Exception {

        Enter.text(driver, LoginFormUI.usernameTxt, username);
        Enter.text(driver, LoginFormUI.passwordTxt, password);

        Click.on(driver, LoginFormUI.loginBtn);
        //ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario de login de Admin llenado");
    }
}

