package task.tasking;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.LandingPageUI;

public class Logout {

    public static void as(WebDriver webDriver) {
        Click.on(webDriver, LandingPageUI.LOGOUT_BUTTON);
    }
}
