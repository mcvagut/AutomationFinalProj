package tasks.searchPet;

import actions.Enter;
import org.openqa.selenium.WebDriver;
import actions.WaitUntilElement;
import ui.HomeUI;

public class SearchPetByName {
    public static void perform(WebDriver driver, String name) throws Exception {
        if (!WaitUntilElement.isVisible(driver, HomeUI.searchBar, 3))
            throw new Exception("Barra de Búsqueda no encontrada");

        Enter.text(driver, HomeUI.searchBar, name);
        //ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}
