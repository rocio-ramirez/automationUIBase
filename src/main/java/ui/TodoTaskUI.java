package ui;

import org.openqa.selenium.By;

public class TodoTaskUI {
    public static final By TODO_INPUT_TITLE = By.id("NewItemContentInput");
    public static final By TODO_ADD_BUTTON = By.id("NewItemAddButton");
    public static final By TODO_ITEM_LIST = By.xpath("//*[@id='mainItemList']/li");
}
