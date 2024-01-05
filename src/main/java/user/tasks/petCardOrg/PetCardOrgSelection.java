package user.tasks.petCardOrg;

import user.actions.Click;
import user.actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import user.ui.HomeOrgUI;

public class PetCardOrgSelection {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, HomeOrgUI.adminRequest, 3))
            throw new Exception("Tarjeta de mascota no encontrada");

        Click.on(driver, HomeOrgUI.adminRequest);

    }
}
