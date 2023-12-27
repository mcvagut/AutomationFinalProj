package tasks.logout;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginFormUI;
import ui.SidebarUI;

public class Logout {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, SidebarUI.logoutBtn);
        //ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
