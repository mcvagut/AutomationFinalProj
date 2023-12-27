package tasks.adoptionApplication;

import actions.GetText;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.PetUI;

public class GetNamePet {
    public static String perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, PetUI.namePet, 2))
            throw new Exception("Nombre de mascota no encontrada");

        return GetText.from(driver, PetUI.namePet);
    }
}
