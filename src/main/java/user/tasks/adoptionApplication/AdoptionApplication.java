package user.tasks.adoptionApplication;

import user.actions.Click;
import com.aventstack.extentreports.Status;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.PetUI;

public class AdoptionApplication {
    public static void perform(WebDriver driver) throws Exception {
        Click.on(driver, PetUI.adoptionButton);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Solicitud de Adopción");
    }
}
