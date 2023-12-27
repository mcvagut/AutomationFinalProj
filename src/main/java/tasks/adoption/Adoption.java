package tasks.adoption;

import actions.GetText;
import actions.WaitUntilElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import ui.AdoptionUI;

public class Adoption {
    public static boolean perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, AdoptionUI.stateAdoptionPetTxt, 2))
            throw new Exception("Mascota no encontrada");

        // Comparar el header con el texto de compra exitosa
        String petAdoption = GetText.from(driver, AdoptionUI.stateAdoptionPetTxt);

        // DONE: Colocar acá un info log con el valor de header
        Logger logger = LogManager.getLogger(Adoption.class);
        logger.info("La mascota fue: " + petAdoption);

        return petAdoption.equals("Aceptado");
    }
}
