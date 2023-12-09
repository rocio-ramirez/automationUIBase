package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.SignUpFormAuthentication;
import ui.TodoLyHomePageUI;
import ui.TodoTaskUI;

public class TodoTask {

    public static void as(WebDriver webDriver, String projectName, String taskName) {
        By projectItem = By.xpath(String.format("//*[@id='mainItemList']/li/[text()='%s']", projectName));
        Click.on(webDriver, projectItem);
        Enter.text(webDriver, TodoTaskUI.TODO_INPUT_TITLE, taskName);
        Click.on(webDriver, TodoTaskUI.TODO_ADD_BUTTON);
    }
}
