package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "rerun:TestOutput/failed_scenario.txt"},
        features = "@TestOutput/failed_scenario.txt",
        glue = {"StepDefinitions","hooks"}
        )
public class FailedRunner {
}
