package admin.tasks.deleteUser;

import user.actions.Click;
import user.actions.Enter;
import user.helpers.ScreenshotHelper;
import admin.ui.LoginFormUI;
import admin.ui.UserUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

public class DeleteUser {
    public static void perform(WebDriver driver) throws Exception {

        Click.on(driver, UserUI.deleteUser);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Eliminando usuario");
    }
}
