package tasks.adoption;

import actions.GetText;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AdoptionUI;

public class GetFirstNamePet {
    public static String perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, AdoptionUI.namePetTxt, 2))
            throw new Exception("Nombre de mascota no encontrada");

        return GetText.from(driver, AdoptionUI.namePetTxt);
    }
}
