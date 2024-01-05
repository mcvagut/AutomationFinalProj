package admin.tasks.addPet;

import admin.ui.LoginFormUI;
import admin.ui.ModalAddPetUI;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import user.actions.Click;
import user.actions.Enter;
import user.helpers.ScreenshotHelper;

import java.io.File;

public class FillRegisterNewPet {
    public static void perform(WebDriver driver, String name, String raza, String description, Number age,
                               String color, String location) throws Exception {

        Enter.text(driver, ModalAddPetUI.nameTxt, name);
        //Thread.sleep(2000);
        Enter.text(driver, ModalAddPetUI.razaTxt, raza);
        //Thread.sleep(2000);
        Select category = new Select(driver.findElement(ModalAddPetUI.categoriaSelect));
        category.selectByValue("Perros");
        //Thread.sleep(2000);
        Enter.text(driver, ModalAddPetUI.descripcionTxt, description);
        //Thread.sleep(2000);
        Enter.text(driver, ModalAddPetUI.edadNumber, age.toString());
        //Thread.sleep(2000);
        Select sexo = new Select(driver.findElement(ModalAddPetUI.sexoSelect));
        sexo.selectByValue("Macho");
        //Thread.sleep(2000);
        Enter.text(driver, ModalAddPetUI.colorTxt, color);
        //Thread.sleep(2000);
        Select tamaño = new Select(driver.findElement(ModalAddPetUI.tamañoSelect));
        tamaño.selectByValue("Pequeño");
        //Thread.sleep(2000);
        String filePath = "C:\\Users\\MoisesC\\Desktop\\SubirFotoSelenium\\Logo.jfif";
        //Thread.sleep(2000);
        WebElement fileInput = driver.findElement(ModalAddPetUI.fotos);
        fileInput.sendKeys(filePath);
        //Thread.sleep(2000);
        Enter.text(driver, ModalAddPetUI.ubicacionTxt, location);
        //Thread.sleep(2000);
        Select organizacion = new Select(driver.findElement(ModalAddPetUI.organizacionSelect));
        organizacion.selectByVisibleText("Peluchin");

        Thread.sleep(2000);
        Click.on(driver, ModalAddPetUI.addPetBtn);
        Thread.sleep(2000);
        //ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y agregando mascota");
    }
}
