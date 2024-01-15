package admin.tasks.logout;

import user.helpers.ScreenshotHelper;
import admin.ui.SidebarAdminUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import user.actions.Click;


public class LogoutAdmin {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, SidebarAdminUI.logoutBtn);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Cierre de Sesión como Administrador");
    }
}
