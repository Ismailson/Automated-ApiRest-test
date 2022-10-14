package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@teste",
        plugin = {"pretty","html:target/cucumber/cucumber-html-report.html","json:target/cucumber/cucumber/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"StepsDefinition"},
        monochrome = true )
public class TestRunner {

}
