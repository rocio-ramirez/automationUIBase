package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.ProjectUI;

public class Project {

    public static void as(WebDriver webDriver, String projectName) {
        Click.on(webDriver, ProjectUI.ADD_NEW_PROJECT_BUTTON);
        Enter.text(webDriver, ProjectUI.PROJECT_NAME_FIELD, projectName);
        Click.on(webDriver, ProjectUI.ADD_BUTTON);
    }
}
