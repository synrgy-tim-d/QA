package Android;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/androidFeatures"},
        glue = {
                "Android"
        },
        plugin = {
                "pretty",
                "html:target/report-cucumber.html",
                "json:target/cucumber-json.json"
        }
)

public class CucumberRunnerTest extends AbstractTestNGCucumberTests {}
