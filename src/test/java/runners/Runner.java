package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
                            "html:target/default-cucumber-reports1.html",
                                "json:target/json-reports/cucumber1.json",
                                "rerun:TestOutput/failed_scenario.txt"},
                    features = "src/test/resources/features",
                    glue = {"StepDefinitions","hooks"},
                    tags = "@bluerental")
public class Runner {


}
