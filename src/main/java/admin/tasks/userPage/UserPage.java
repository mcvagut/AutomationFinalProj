package admin.tasks.userPage;

import admin.actions.Click;
import admin.actions.Enter;
import admin.helpers.ScreenshotHelper;
import admin.ui.LoginFormUI;
import admin.ui.SidebarAdminUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

public class UserPage {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, SidebarAdminUI.userSection);
        //ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Redireccionando a la seccion de usuarios");
    }
}
