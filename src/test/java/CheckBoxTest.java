import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.CheckBoxElement;
import task.validations.IsCheckbox;
import ui.CheckBoxUI;

public class CheckBoxTest extends BaseTest {
    @Test
    public void checkboxMarked() {
        CheckBoxElement.as(webDriver);
        Assert.assertTrue(IsCheckbox.checked(webDriver, CheckBoxUI.checkbox2));
    }

    @Test
    public void bothCheckboxMarked() {
        CheckBoxElement.as2(webDriver);
        Assert.assertTrue(IsCheckbox.checked(webDriver, CheckBoxUI.checkbox1));
        Assert.assertTrue(IsCheckbox.checked(webDriver, CheckBoxUI.checkbox2));
    }

    @Test
    public void bothCheckboxUnmarked() {
        CheckBoxElement.as3(webDriver);
        Assert.assertFalse(IsCheckbox.checked(webDriver, CheckBoxUI.checkbox1));
        Assert.assertFalse(IsCheckbox.checked(webDriver, CheckBoxUI.checkbox2));
    }
}
