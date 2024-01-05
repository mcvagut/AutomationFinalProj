package user.tasks.adoption;

import user.actions.GetText;
import user.actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import user.ui.AdoptionUI;

public class GetFirstNamePet {
    public static String perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, AdoptionUI.namePetTxt, 2))
            throw new Exception("Nombre de mascota no encontrada");

        return GetText.from(driver, AdoptionUI.namePetTxt);
    }
}
