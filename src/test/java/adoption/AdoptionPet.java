package adoption;

import baseUser.BaseTestUser;
import org.testng.Assert;
import org.testng.annotations.Test;
import user.tasks.adminRequest.AdminRequestOrg;
import user.tasks.adoption.GetFirstNamePet;
import user.tasks.adoptionApplication.AdoptionApplication;
import user.tasks.adoptionApplication.GetNamePet;
import user.tasks.historyAdoption.HistoryAdoptionUser;
import user.tasks.login.FillLoginForm;
import user.tasks.logout.Logout;
import user.tasks.logout.LogoutOrg;
import user.tasks.petCard.PetCardSelection;
import user.tasks.petCardOrg.PetCardOrgSelection;
import user.tasks.register.FillRegisterForm;
import user.tasks.register.GoToRegisterPage;
import user.tasks.register.SelectRegisterTypeForm;
import user.tasks.searchPet.SearchPetByName;


public class AdoptionPet extends BaseTestUser {
    @Test(description = "Registro de Nuevo Usuario")
    public void register() throws Exception {

        //Flujo como Usuario
        Thread.sleep(3000);
        GoToRegisterPage.perform(driver);
        Thread.sleep(3000);
        SelectRegisterTypeForm.perform(driver);
        Thread.sleep(3000);
        FillRegisterForm.perform(driver, "EjemploNombre", "EjemploApellido", "ejemplo@gmail.com",
                "usuario", "password", "Bolivia", "La Paz", "7777777", "22/03/1995");
        Thread.sleep(3000);
        FillLoginForm.perform(driver, "usuario", "password");
        Thread.sleep(3000);
        SearchPetByName.perform(driver, "mascotadiplomado");
        Thread.sleep(3000);
        PetCardSelection.perform(driver);
        Thread.sleep(3000);
        AdoptionApplication.perform(driver);
        String chosenPet = GetNamePet.perform(driver);
        //String selectedProductPrice = GetProductPrice.perform(driver);
        Thread.sleep(5000);
        Logout.perform(driver);
        Thread.sleep(5000);

        //Flujo como Organización
        FillLoginForm.perform(driver, "peluchin", "peluchin");
        Thread.sleep(3000);
        PetCardOrgSelection.perform(driver);
        Thread.sleep(3000);
        AdminRequestOrg.perform(driver);
        LogoutOrg.perform(driver);
        Thread.sleep(5000);

        //Flujo como Usuario para verificar que la solicitud fue aceptada
        FillLoginForm.perform(driver, "usuario", "password");
        Thread.sleep(3000);
        HistoryAdoptionUser.perform(driver);
        Thread.sleep(5000);
        String petName = GetFirstNamePet.perform(driver);

        //Assert
        Assert.assertEquals(chosenPet,petName);
    }
}


