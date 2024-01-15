package user.tasks.login;

import user.actions.Click;
import user.actions.Enter;
import com.aventstack.extentreports.Status;
import user.actions.WaitUntilElement;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.LoginFormUI;
import user.ui.SidebarUI;

public class FillLoginForm {
    public static void perform(WebDriver driver, String username, String password) throws Exception {
        if (!WaitUntilElement.isVisible(driver, LoginFormUI.loginBtn, 3))
            throw new Exception("El botón no fue encontrado");

        Enter.text(driver, LoginFormUI.usernameTxt, username);
        Enter.text(driver, LoginFormUI.passwordTxt, password);

        Click.on(driver, LoginFormUI.loginBtn);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Inicio de sesión");
    }
}

