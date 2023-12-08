package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;

public class IsAddedElement {

    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, AddRemove.add);
    }
}
