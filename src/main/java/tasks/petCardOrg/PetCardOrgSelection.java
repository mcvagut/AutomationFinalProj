package tasks.petCardOrg;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomeOrgUI;
import ui.HomeUI;

public class PetCardOrgSelection {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, HomeOrgUI.adminRequest, 3))
            throw new Exception("Tarjeta de mascota no encontrada");

        Click.on(driver, HomeOrgUI.adminRequest);

    }
}
