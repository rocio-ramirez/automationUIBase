package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.TodoLyHomePageUI;

public class HomePage {


    public static boolean isVisible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, TodoLyHomePageUI.FORM_SIGNUP);
    }
}
