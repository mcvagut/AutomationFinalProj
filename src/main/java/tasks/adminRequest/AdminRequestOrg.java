package tasks.adminRequest;

import actions.Click;
import actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import ui.AdminRequestOrgUI;
import ui.PetUI;

public class AdminRequestOrg {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, AdminRequestOrgUI.acceptButton, 3))
            throw new Exception("El botón no fue encontrado");

        Click.on(driver, AdminRequestOrgUI.acceptButton);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
