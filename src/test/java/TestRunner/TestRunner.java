package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sourabh\\IdeaProjects\\Project02\\src\\test\\java\\Features",
        glue = "StepDefination", tags = "@SearchingGoogle", dryRun = false)
public class TestRunner {
}
