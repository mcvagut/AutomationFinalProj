package admin.tasks.addPet;

import admin.ui.PetUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import user.actions.Click;
import user.helpers.ScreenshotHelper;

import java.io.IOException;


public class AddPetModal {
    public static void perform(WebDriver driver) throws IOException, InterruptedException {
        Click.on(driver, PetUI.addPet);
        Thread.sleep(2000);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Sección de mascotas");
    }


}
