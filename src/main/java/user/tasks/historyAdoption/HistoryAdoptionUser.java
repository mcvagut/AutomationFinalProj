package user.tasks.historyAdoption;

import user.actions.Click;
import user.actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.SidebarUI;

public class HistoryAdoptionUser {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, SidebarUI.historyAdoptionBtn, 3))
            throw new Exception("El botón no fue encontrado");

        Click.on(driver, SidebarUI.historyAdoptionBtn);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
