package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.FormAuthentication;
import ui.HomePageUI;

public class Login {

    public static void as(WebDriver webDriver, String user, String pass) {
        Click.on(webDriver, HomePageUI.formAuth);
        Enter.text(webDriver, FormAuthentication.username, user);
        Enter.text(webDriver, FormAuthentication.password, pass);
        Click.on(webDriver, FormAuthentication.loginButton);
    }
}
