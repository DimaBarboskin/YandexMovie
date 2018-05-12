import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Rogoza Dimity on 12.05.2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"steps"},
        plugin = {
                "application.AllureReporter",
        }
)
public class CucumberRunner {
}
