package tasks.adoptionApplication;

import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import ui.PetUI;
import ui.RegisterFormUI;

public class AdoptionApplication {
    public static void perform(WebDriver driver) throws Exception {
        Click.on(driver, PetUI.adoptionButton);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
