package user.tasks.adoptionApplication;

import user.actions.GetText;
import user.actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import user.ui.PetUI;

public class GetNamePet {
    public static String perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, PetUI.namePet, 2))
            throw new Exception("Nombre de mascota no encontrada");

        return GetText.from(driver, PetUI.namePet);
    }
}
