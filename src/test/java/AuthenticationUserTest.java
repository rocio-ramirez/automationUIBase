import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Logout;
import task.tasking.SignUp;
import task.validations.HomePage;
import task.validations.LandingPage;

public class AuthenticationUserTest extends BaseTest {

    @Test
    public void testUserSignUp() {
        SignUp.as(webDriver,"rocio.ramirez.ch",
                            "SuperSecretPassword!",
                            "rocio123@email.com");
        Assert.assertTrue(LandingPage.isVisible(webDriver));
    }

    @Test
    public void testUserLogout() {
        Login.as(webDriver, "rocio123@email.com", "SuperSecretPassword!");
        Logout.as(webDriver);
        Assert.assertTrue(HomePage.isVisible(webDriver));

    }

    @Test
    public void testUserLogin() {
        Login.as(webDriver, "rocio123@email.com", "SuperSecretPassword!");
        Assert.assertTrue(LandingPage.isVisible(webDriver));
    }
}
