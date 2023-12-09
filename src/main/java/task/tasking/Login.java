package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginFormUI;
import ui.TodoLyHomePageUI;

public class Login {

    public static void as(WebDriver webDriver, String user, String pass) {
        Click.on(webDriver, TodoLyHomePageUI.LOGIN_BUTTON);
        Enter.text(webDriver, LoginFormUI.username, user);
        Enter.text(webDriver, LoginFormUI.password, pass);
        Click.on(webDriver, LoginFormUI.uncheckRememberMe);
        Click.on(webDriver, LoginFormUI.loginButton);
    }
}
