package ui;

import org.openqa.selenium.By;

public class ProjectUI {
    public static final By ADD_NEW_PROJECT_BUTTON = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div");
    public static final By PROJECT_NAME_FIELD = By.id("NewProjNameInput");
    public static final By ADD_BUTTON = By.id("NewProjNameButton");
    public static final By MAIN_PROJECT_LIST = By.xpath("//*[@id='ProjectListPlaceHolder'/li]");
}
