package ui;

import org.openqa.selenium.By;

public class LoginFormUI {
    public static By username = By.id("ctl00_MainContent_LoginControl1_TextBoxEmail");
    public static By password = By.id("ctl00_MainContent_LoginControl1_TextBoxPassword");
    public static By uncheckRememberMe = By.id("ctl00_MainContent_LoginControl1_CbRemember");
    public static By loginButton = By.id("ctl00_MainContent_LoginControl1_ButtonLogin");
}
