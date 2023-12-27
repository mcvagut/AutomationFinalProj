package tasks.historyAdoption;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AdminRequestOrgUI;
import ui.SidebarUI;

public class HistoryAdoptionUser {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, SidebarUI.historyAdoptionBtn, 3))
            throw new Exception("El botón no fue encontrado");

        Click.on(driver, SidebarUI.historyAdoptionBtn);
        //ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
