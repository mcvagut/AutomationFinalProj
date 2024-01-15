package user.tasks.logout;

import user.actions.Click;
import com.aventstack.extentreports.Status;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.SidebarOrgUI;

public class LogoutOrg {

        public static void perform(WebDriver driver) throws Exception {

            Click.on(driver, SidebarOrgUI.logoutOrg);
            ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Cierre de sesión de albergue");
        }
}
