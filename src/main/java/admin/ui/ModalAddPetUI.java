package admin.ui;

import org.openqa.selenium.By;

public class ModalAddPetUI {
    public static final By nameTxt = By.id("nombre");
    public static final By razaTxt = By.id("raza");
    public static final By categoriaSelect = By.xpath("//select[@id='categoria']");
    public static final By descripcionTxt = By.id("descripcion");
    public static final By edadNumber = By.id("edad");
    public static final By sexoSelect = By.xpath("//select[@id='sexo']");
    public static final By colorTxt = By.id("color");
    public static final By tamañoSelect = By.xpath("//select[@id='tamaño']");
    public static final By fotos = By.id("fotos");
    public static final By ubicacionTxt = By.id("ubicacion");
    public static final By organizacionSelect = By.xpath("//select[@id='organizacion']");
    public static final By addPetBtn = By.id("agregarMascotaButton");
}
