package admin.tasks.petPage;

import admin.actions.Click;
import admin.helpers.ScreenshotHelper;
import admin.ui.SidebarAdminUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

public class PetPage {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, SidebarAdminUI.petSection);
        //ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Redireccionando a la seccion de mascotas");
    }
}
