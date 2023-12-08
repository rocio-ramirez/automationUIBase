package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.CheckBoxUI;
import ui.HomePageUI;
import java.util.List;

public class CheckBoxElement {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, HomePageUI.checkBoxes);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Click Checkbox");
    }

    public static void as2(WebDriver webDriver) {
        Click.on(webDriver, HomePageUI.checkBoxes);
        List<WebElement> elementList = webDriver.findElements(CheckBoxUI.checkboxes2);
        elementList.get(0).click();
//        elementList.forEach(WebElement::click);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Click Checkbox");
    }

    public static void as3(WebDriver webDriver) {
        Click.on(webDriver, HomePageUI.checkBoxes);
        List<WebElement> elementList = webDriver.findElements(CheckBoxUI.checkboxes2);
        elementList.get(1).click();
//        elementList.forEach(WebElement::click);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Click Checkbox");
    }
}
