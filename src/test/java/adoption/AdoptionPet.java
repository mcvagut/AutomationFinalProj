package adoption;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.adminRequest.AdminRequestOrg;
import tasks.adoption.GetFirstNamePet;
import tasks.adoptionApplication.AdoptionApplication;
import tasks.adoptionApplication.GetNamePet;
import tasks.historyAdoption.HistoryAdoptionUser;
import tasks.login.FillLoginForm;
import tasks.logout.Logout;
import tasks.logout.LogoutOrg;
import tasks.petCard.PetCardSelection;
import tasks.petCardOrg.PetCardOrgSelection;
import tasks.register.FillRegisterForm;
import tasks.register.GoToRegisterPage;
import tasks.register.SelectRegisterTypeForm;
import tasks.searchPet.SearchPetByName;


public class AdoptionPet extends BaseTest {
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
        Thread.sleep(5000);
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


