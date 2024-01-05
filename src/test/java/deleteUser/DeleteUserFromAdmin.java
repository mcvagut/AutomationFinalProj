package deleteUser;

import admin.tasks.deleteUser.DeleteUser;
import admin.tasks.login.FillLoginFormAmin;
import admin.tasks.logout.LogoutAdmin;
import admin.tasks.userPage.UserPage;
import baseAdmin.BaseTestAdmin;
import org.testng.annotations.Test;

public class DeleteUserFromAdmin extends BaseTestAdmin {
    @Test(description = "Eliminar Usuario")

    public void deleteUser() throws Exception {

        FillLoginFormAmin.perform(driver, "moises", "moises");
        UserPage.perform(driver);
        Thread.sleep(2000);
        DeleteUser.perform(driver);
        Thread.sleep(2000);
        LogoutAdmin.perform(driver);
    }
}
