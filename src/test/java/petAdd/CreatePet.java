package petAdd;

import admin.tasks.addPet.AddPetModal;
import admin.tasks.addPet.FillRegisterNewPet;
import admin.tasks.deletePet.DeletePet;
import admin.tasks.login.FillLoginFormAmin;
import admin.tasks.logout.LogoutAdmin;
import admin.tasks.petPage.PetPage;
import baseAdmin.BaseTestAdmin;
import org.testng.annotations.Test;

public class CreatePet extends BaseTestAdmin {
    @Test(description = "Crear Mascota")
    public void register() throws Exception {


        FillLoginFormAmin.perform(driver, "moises", "moises");
        PetPage.perform(driver);
        AddPetModal.perform(driver);
        FillRegisterNewPet.perform(driver, "MascotaDiplomado", "Maltese", "Ejemplo de automatización", 2, "Blanco", "La Paz");
        Thread.sleep(2000);
        LogoutAdmin.perform(driver);

    }
}
