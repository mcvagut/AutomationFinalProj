package tasks.logout;

import actions.Click;
import com.aventstack.extentreports.Status;
import helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import ui.SidebarOrgUI;
import ui.SidebarUI;

public class LogoutOrg {

        public static void perform(WebDriver driver) throws Exception {

            Click.on(driver, SidebarOrgUI.logoutOrg);
            ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
        }
}
