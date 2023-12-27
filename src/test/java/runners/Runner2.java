package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports2.html",
        "json:target/json-reports/cucumber2.json"},
        features = "src/test/resources/features",
        glue = {"StepDefinitions","hooks"},
        tags = "@ne")
public class Runner2 {


}
