package tasks.petCard;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.HomeUI;

public class PetCardSelection {
    public static void perform(WebDriver driver) throws Exception {
        if (!WaitUntilElement.isVisible(driver, HomeUI.selectPetCard, 3))
            throw new Exception("Tarjeta de mascota no encontrada");

        Click.on(driver, HomeUI.selectPetCard);

}
}