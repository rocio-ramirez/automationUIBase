package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.LandingPageUI;

public class WaitUntilElement {

    public static WebElement waitOnElement(WebDriver webDriver,  By locator, Integer timeout) {
        WebElement element = webDriver.findElement(locator);
        synchronized (element) {
            try {
                element.wait(timeout * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return element;
    }
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
