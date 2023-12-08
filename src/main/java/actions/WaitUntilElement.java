package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntilElement {

    public static boolean isPresent(WebDriver webDriver, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 3);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isVisible(WebDriver webDriver, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 3);
            wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(locator)));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isChecked(WebDriver webDriver, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 1);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            return element.isSelected();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
