package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features"},
        glue = {"steps"},
        plugin = {"pretty", "json:target/json-report/cucumber.json"},
        monochrome = true,
        tags = "@P3")
//        name = {"Link"})
public class TestRunner {
}
