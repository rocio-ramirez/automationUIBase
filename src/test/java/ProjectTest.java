import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Project;
import task.validations.ProjectValidation;

public class ProjectTest extends BaseTest {

    @Test
    public void testCreateNewProject() throws InterruptedException {
        Login.as(webDriver, "rocio123@email.com", "SuperSecretPassword!");
        String newProjectName = "Rocio ProjectTest1";
        Project.as(webDriver, "Rocio ProjectTest1");
        Assert.assertEquals(ProjectValidation.getProjectName(webDriver), newProjectName);
    }
}
