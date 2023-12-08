package ui;

import org.openqa.selenium.By;

public class FormAuthentication {
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By loginButton = By.xpath("//*[@id=\"login\"]/button/i");
    // fa fa-2x fa-sign-in
    public static By alertSuccessMessage = By.xpath("//*[@id=\"flash\"]");
    public static By alertFailMessage = By.xpath(("//*[@id=\"flash\"]"));
}
