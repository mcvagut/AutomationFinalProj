package tasks.register;

import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.RegisterFormUI;


import java.util.Date;

public class FillRegisterForm {
    public static void perform(WebDriver driver, String name, String lastname, String email, String username, String password,
    String country, String city, String phone, String birthday) throws Exception {

        Enter.text(driver, RegisterFormUI.nameTxt, name);
        Enter.text(driver, RegisterFormUI.lastNameTxt, lastname);
        Enter.text(driver, RegisterFormUI.emailTxt, email);
        Enter.text(driver, RegisterFormUI.usernameTxt, username);
        Enter.text(driver, RegisterFormUI.passwordTxt, password);
        Enter.text(driver, RegisterFormUI.countryTxt, country);
        Enter.text(driver, RegisterFormUI.cityTxt, city);
        Enter.text(driver, RegisterFormUI.phoneTxt, phone);
        Enter.text(driver, RegisterFormUI.dateBirthTxt, birthday);

        Click.on(driver, RegisterFormUI.registerBtn);
        //ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Formulario llenado y orden realizada");
    }
}