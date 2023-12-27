package tasks.logout;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.SidebarOrgUI;
import ui.SidebarUI;

public class LogoutOrg {

        public static void perform(WebDriver driver) throws Exception {

            Click.on(driver, SidebarOrgUI.logoutOrg);
            //ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
        }
}
