package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthentication;

public class IsLoginMessage {

    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, FormAuthentication.alertSuccessMessage);
    }

    public static String getTextSuccess(WebDriver webDriver, By pathElement) {
        WebElement element = webDriver.findElement(pathElement);
        return element.getText();
    }
}
