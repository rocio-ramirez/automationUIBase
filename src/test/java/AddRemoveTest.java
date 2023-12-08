import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddElements;
import task.tasking.RemoveElements;
import task.validations.IsAddedElement;
import task.validations.IsDeletedElement;

public class AddRemoveTest extends BaseTest {

    @Test
    public void addElementTest() {
        AddElements.as(webDriver);
        Assert.assertTrue(IsDeletedElement.visible(webDriver));
    }

    @Test
    public void removeElementTest(){
        RemoveElements.as(webDriver);
        Assert.assertFalse(IsDeletedElement.visible(webDriver));
        Assert.assertTrue(IsAddedElement.visible(webDriver));
    }
}
