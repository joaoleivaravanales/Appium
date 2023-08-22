package Run;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/main/java/feature/",
        glue = "com.mobile.automation.framework.step",
        tags = "@Caso001"

)
public class CucumberRun {
}
