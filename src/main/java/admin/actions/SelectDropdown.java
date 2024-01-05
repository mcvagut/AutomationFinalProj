package admin.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SelectDropdown {
    public static void option(WebDriver webDriver, By locator, String option){
        webDriver.findElement(locator).sendKeys(option);
    }
}
