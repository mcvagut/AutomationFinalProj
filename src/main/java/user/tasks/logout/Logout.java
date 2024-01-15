package user.tasks.logout;

import user.actions.Click;
import com.aventstack.extentreports.Status;
import user.actions.WaitUntilElement;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.SidebarUI;

public class Logout {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, SidebarUI.logoutBtn, 3))
            throw new Exception("El botón no fue encontrado");
        Click.on(driver, SidebarUI.logoutBtn);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Cierre de sesión de usuario");
    }
}
