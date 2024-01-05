package admin.tasks.addPet;

import admin.ui.PetUI;
import org.openqa.selenium.WebDriver;
import user.actions.Click;


public class AddPetModal {
    public static void perform(WebDriver driver) {
        Click.on(driver, PetUI.addPet);
    }

}
