package admin.tasks.deletePet;

import admin.actions.Click;
import admin.ui.PetUI;
import admin.ui.UserUI;
import org.openqa.selenium.WebDriver;

public class DeletePet {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, PetUI.deletePet);
        // ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Eliminando usuario");
    }
}
