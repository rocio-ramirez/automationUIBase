package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.LandingPageUI;

public class LandingPage {


    public static boolean isVisible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LandingPageUI.LOGOUT_BUTTON)
                && WaitUntilElement.isVisible(webDriver, LandingPageUI.DEFAULT_PROJECT_TITLE);
    }
}
