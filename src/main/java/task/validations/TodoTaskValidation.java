package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.LandingPageUI;

public class TodoTaskValidation {

    public static boolean isTaskWithName(WebDriver webDriver, String taskName) {
        By locator = By.xpath(String.format("//*[@id='mainItemList']/li/[text()='%s'", taskName));
        return WaitUntilElement.isPresent(webDriver, locator);
    }
}
