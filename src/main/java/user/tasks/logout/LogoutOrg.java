package user.tasks.logout;

import user.actions.Click;
import com.aventstack.extentreports.Status;
import user.actions.WaitUntilElement;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.SidebarOrgUI;
import user.ui.SidebarUI;

public class LogoutOrg {

        public static void perform(WebDriver driver) throws Exception {
            if (!WaitUntilElement.isVisible(driver, SidebarOrgUI.logoutOrg, 3))
                throw new Exception("El botón no fue encontrado");
            Click.on(driver, SidebarOrgUI.logoutOrg);
            ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Cierre de sesión de albergue");
        }
}
