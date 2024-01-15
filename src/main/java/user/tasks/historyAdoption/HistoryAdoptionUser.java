package user.tasks.historyAdoption;

import user.actions.Click;
import user.actions.WaitUntilElement;
import com.aventstack.extentreports.Status;
import user.helpers.ScreenshotHelper;
import org.openqa.selenium.WebDriver;
import user.ui.SidebarUI;

public class HistoryAdoptionUser {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, SidebarUI.historyAdoptionBtn, 5))
            throw new Exception("El botón no fue encontrado");

        Click.on(driver, SidebarUI.historyAdoptionBtn);
        Thread.sleep(2000);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Adopción completada");
    }
}
