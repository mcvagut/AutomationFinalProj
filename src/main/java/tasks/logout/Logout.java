package tasks.logout;

import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import ui.LoginFormUI;
import ui.SidebarUI;

public class Logout {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, SidebarUI.logoutBtn);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
