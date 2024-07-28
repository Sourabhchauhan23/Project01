package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.globalLogic.Pages.Actions.EspnCricInfo;
import org.globalLogic.Utils.Resources;
import org.testng.Assert;

public class LucknowSuperGaintsStats {

    EspnCricInfo espnCricInfo = new EspnCricInfo();

    @Given("{string} is open on web browser.")
    public void isOpenOnWebBrowser(String website) throws InterruptedException {
        espnCricInfo.navigateTo(Resources.valueOf(website).getResource());
    }

    @When("{string} score card is present.")
    public void lucknowSuperGaintsScoreCardIsPresent(String teamName) {
        espnCricInfo.isLSGScoreCardPresent();
    }

    @Then("Verify {string} has scored {int} six's.")
    public void verifyMaxScoredSixS(String player,int sixS) {
        Assert.assertTrue(espnCricInfo.verifySix(player,sixS),"");
    }

    @And("Verify {string} has scored {int} four's.")
    public void verifyMaxScoredFourS(String player, int fourS) {
        Assert.assertTrue(espnCricInfo.verifyFour(player,fourS),"");
    }

    @And("Verify total score is {int}.")
    public void verifyTotalScoreIs(int score) {
        Assert.assertEquals(espnCricInfo.totalScore(), score);
    }

    @And("Verify total wickets are {int}.")
    public void verifyTotalWicketsAre(int wicket) {
        Assert.assertEquals(espnCricInfo.totalWickets(), wicket);
    }
}
