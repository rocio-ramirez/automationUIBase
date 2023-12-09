package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LandingPageUI;
import ui.SignUpFormAuthentication;
import ui.TodoLyHomePageUI;

public class Logout {

    public static void as(WebDriver webDriver) {
        Click.on(webDriver, LandingPageUI.LOGOUT_BUTTON);
    }
}
