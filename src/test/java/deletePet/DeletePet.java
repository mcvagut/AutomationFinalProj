package deletePet;

import admin.tasks.login.FillLoginFormAmin;
import admin.tasks.logout.LogoutAdmin;
import admin.tasks.petPage.PetPage;
import baseAdmin.BaseTestAdmin;
import org.testng.annotations.Test;

public class DeletePet extends BaseTestAdmin {
    @Test(description = "Eliminar Mascota")
    public void deletePet() throws Exception {

        FillLoginFormAmin.perform(driver, "moises", "moises");
        Thread.sleep(2000);
        PetPage.perform(driver);
        Thread.sleep(2000);
        admin.tasks.deletePet.DeletePet.perform(driver);
        Thread.sleep(2000);
        PetPage.perform(driver);
        Thread.sleep(2000);
        LogoutAdmin.perform(driver);
    }
}
