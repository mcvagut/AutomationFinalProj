package admin.tasks.userPage;

import user.actions.Click;
import user.actions.Enter;
import user.actions.WaitUntilElement;
import user.helpers.ScreenshotHelper;
import admin.ui.LoginFormUI;
import admin.ui.SidebarAdminUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import user.ui.SidebarUI;

public class UserPage {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, SidebarAdminUI.userSection, 5))
            throw new Exception("El botón no fue encontrado");

        Click.on(driver, SidebarAdminUI.userSection);
        Thread.sleep(2000);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Redireccionando a la seccion de usuarios");
    }
}
