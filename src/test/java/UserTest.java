import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SignUp;
import task.validations.LandingPage;

public class UserTest extends BaseTest {

    @Test
    public void testUserSignUp() {
        SignUp.as(webDriver,"rocio.ramirez.ch",
                            "SuperSecretPassword!",
                            "rocio123@email.com");
        Assert.assertTrue(LandingPage.isVisible(webDriver));
    }
}
