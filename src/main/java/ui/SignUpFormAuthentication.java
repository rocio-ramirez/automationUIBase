package ui;

import org.openqa.selenium.By;

public class SignUpFormAuthentication {
    public static By username = By.id("ctl00_MainContent_SignupControl1_TextBoxFullName");
    public static By password = By.id("ctl00_MainContent_SignupControl1_TextBoxPassword");
    public static By email = By.id("ctl00_MainContent_SignupControl1_TextBoxEmail");
    public static By checkTermsAndConditions = By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms");
    public static By loginButton = By.id("ctl00_MainContent_SignupControl1_ButtonSignup");
}
