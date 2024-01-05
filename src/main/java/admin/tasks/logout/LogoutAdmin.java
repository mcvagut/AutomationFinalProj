package admin.tasks.logout;

import admin.ui.SidebarAdminUI;
import org.openqa.selenium.WebDriver;
import user.actions.Click;


public class LogoutAdmin {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, SidebarAdminUI.logoutBtn);
        // ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
