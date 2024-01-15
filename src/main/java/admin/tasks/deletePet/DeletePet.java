package admin.tasks.deletePet;

import user.actions.Click;
import user.helpers.ScreenshotHelper;
import admin.ui.PetUI;
import admin.ui.UserUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

public class DeletePet {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, PetUI.deletePet);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Eliminando Mascota");
    }
}
