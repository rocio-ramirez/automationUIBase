import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.validations.IsLoginMessage;
import ui.FormAuthentication;

public class AuthenticationTest extends BaseTest {

    @Test
    public void authentication() {
        Login.as(webDriver, "tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(IsLoginMessage.visible(webDriver));
        Assert.assertTrue(IsLoginMessage.getTextSuccess(webDriver, FormAuthentication.alertSuccessMessage).contains("You logged into a secure area!"));
    }

    @Test
    public void authenticationFailUsername() {
        Login.as(webDriver, "tom", "");
        Assert.assertTrue(IsLoginMessage.getTextSuccess(webDriver, FormAuthentication.alertFailMessage).contains("Your username is invalid!"));
    }

    @Test
    public void authenticationFailPassword() {
        Login.as(webDriver, "tomsmith", "");
        Assert.assertTrue(IsLoginMessage.getTextSuccess(webDriver, FormAuthentication.alertFailMessage).contains("Your password is invalid!"));
    }
}
