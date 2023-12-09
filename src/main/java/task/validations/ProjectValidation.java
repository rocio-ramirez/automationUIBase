package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.LandingPageUI;

public class ProjectValidation {

    public static String getProjectName(WebDriver webDriver) {
        WebElement element = WaitUntilElement.waitOnElement(webDriver, LandingPageUI.CURRENT_PROJECT_TITLE, 5);
        return element.getText();
    }
}
