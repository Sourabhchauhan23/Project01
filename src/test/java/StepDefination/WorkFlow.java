package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.globalLogic.Pages.Actions.Background;

public class WorkFlow {
    Background background = new Background();

    @Given("Open {string} on browser.")
    public void runBackground(String website){
        background.openWebsite(website);
    }

//    @After
    public void closeBroser(){
        background.closeBrowser();
    }
}
