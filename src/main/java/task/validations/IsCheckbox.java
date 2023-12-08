package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.CheckBoxUI;

public class IsCheckbox {
    public static boolean checked(WebDriver webDriver, By checkbox) {
        return WaitUntilElement.isChecked(webDriver, checkbox);
    }
}
