package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.globalLogic.Pages.Actions.Background;

import java.io.IOException;

public class WorkFlow {
    Background background = new Background();

    @Given("Open {string} on browser.")
    public void runBackground(String website){
        background.openWebsite(website);
    }

    @After
    public void closeBroser(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            background.screenshot(scenario);
        }
        background.closeBrowser();
    }
}
