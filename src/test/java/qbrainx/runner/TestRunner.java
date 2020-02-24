package qbrainx.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "qbrainx.stepDefinition", dryRun = false, strict = false, monochrome = true, tags = {"@Sanity"})
public class TestRunner {

}
