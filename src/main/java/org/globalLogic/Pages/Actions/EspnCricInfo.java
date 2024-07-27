package org.globalLogic.Pages.Actions;

import org.globalLogic.Base.Base;
import org.globalLogic.Pages.Locators.EspnCricInfoLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class EspnCricInfo extends Base {

    public EspnCricInfoLocator espnCricInfoLocator;

    public EspnCricInfo(){
        espnCricInfoLocator = new EspnCricInfoLocator();
        AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(ajaxElementLocatorFactory, this.espnCricInfoLocator);
    }


    public boolean isLSGScoreCardPresent(){
        return isElementPresent(espnCricInfoLocator.ESPNcricinfo);
    }

    public void verifySix(String player, int count){

    }

    public void verifyFour(String player, int count){

    }

    public int totalScore(){

        return 0;
    }

    public int totalWickets(){

        return 0;
    }

}
