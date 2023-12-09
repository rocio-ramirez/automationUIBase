import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.TodoTask;
import task.validations.TodoTaskValidation;

public class TODOTaskTest extends BaseTest {
    @Test
    public void testAddTask() {
        Login.as(webDriver, "rocio123@email.com", "SuperSecretPassword!");
        String projectName = "Rocio ProjectTest1";
        String taskName = "Rocio Test Task 1";
        TodoTask.as(webDriver, projectName, taskName);
        Assert.assertTrue(TodoTaskValidation.isTaskWithName(webDriver, taskName));
    }
}
