package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.SignUpFormAuthentication;
import ui.TodoLyHomePageUI;

public class SignUp {

    public static void as(WebDriver webDriver, String user, String pass, String email) {
        Click.on(webDriver, TodoLyHomePageUI.FORM_SIGNUP);
        Enter.text(webDriver, SignUpFormAuthentication.username, user);
        Enter.text(webDriver, SignUpFormAuthentication.password, pass);
        Enter.text(webDriver, SignUpFormAuthentication.email, email);
        Click.on(webDriver, SignUpFormAuthentication.checkTermsAndConditions);
        Click.on(webDriver, SignUpFormAuthentication.loginButton);
    }
}
