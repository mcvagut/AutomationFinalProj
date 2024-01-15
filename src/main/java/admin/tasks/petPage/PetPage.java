package admin.tasks.petPage;

import user.actions.Click;
import user.helpers.ScreenshotHelper;
import admin.ui.SidebarAdminUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

public class PetPage {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, SidebarAdminUI.petSection);
        Thread.sleep(2000);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Redireccionando a la sección de mascotas");
    }
}
