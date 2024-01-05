package user.tasks.adminRequest;

import user.actions.Click;
import user.actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.AdminRequestOrgUI;

public class AdminRequestOrg {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, AdminRequestOrgUI.acceptButton, 3))
            throw new Exception("El botón no fue encontrado");

        Click.on(driver, AdminRequestOrgUI.acceptButton);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
