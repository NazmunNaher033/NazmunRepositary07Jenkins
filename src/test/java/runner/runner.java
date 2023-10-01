package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class runner {


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/resources/features"},
            glue = {"stepDefinitions", "Hooks"},
            tags = "@smoke",
            //  {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" }
            plugin =  {"pretty", "html:target/cucumber-reports"}
    )
    public class Runner {

    }
}
