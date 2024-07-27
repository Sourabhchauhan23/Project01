package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.globalLogic.Pages.Actions.Google;
import org.globalLogic.Pages.Actions.Yatra;
import org.globalLogic.Utils.Resources;

public class SearchingGoogle {

    Google google = new Google();
    Yatra yatra = new Yatra();

    @Given("User search for {string} on google.")
    public void searchingGoogle(String inputText){
        google.googleSearch(inputText);
    }

    @When("All the search results appears, select flight for {string}.")
    public void resultAppears(String inputText){
         google.verifySearchOptions(inputText);

    }

    @Then("Open {string} website in new tab.")
    public void openWebsiteInNewTab(String inputText){
        google.findAndOpenWebsiteInNewTab(Resources.valueOf(inputText).getResource());
    }

    @And("Verify {string} is appearing on webpage.")
    public void verifyPage(String inputText){
        yatra.verifyWebsite();
    }
}
