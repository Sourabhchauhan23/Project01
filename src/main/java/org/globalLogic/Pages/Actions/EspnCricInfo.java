package org.globalLogic.Pages.Actions;

import org.globalLogic.Base.Base;
import org.globalLogic.Pages.Locators.EspnCricInfoLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    public boolean verifySix(String player, int sixS){
        int actualSixS=0;
        for(WebElement webElement : espnCricInfoLocator.allBatsmanStats){
            System.out.println(webElement.findElement(By.xpath("//td[1]/div/a")).getAttribute("title"));
            System.out.println(webElement.getAttribute("title"));
            if(webElement.findElement(By.xpath("//td[1]/div/a")).isDisplayed()){
                if(webElement.findElement(By.xpath("//td[1]/div/a")).getAttribute("title").equals(player)){
                    actualSixS = Integer.parseInt(webElement.findElement(By.xpath("//td[7]")).getText());
                }
            }
            System.out.println("actual- " + actualSixS + "; expected- " + sixS);
        }
        return sixS==actualSixS;
    }

    public boolean verifyFour(String player, int fourS){
        int actualFourS=0;
        for(WebElement webElement : espnCricInfoLocator.allBatsmanStats){
            System.out.println(webElement.findElement(By.xpath("//td[1]/div/a")).getAttribute("title"));
            if(webElement.findElement(By.xpath("//td[1]/div/a")).getAttribute("title").equals(player)){
                actualFourS = Integer.parseInt(webElement.findElement(By.xpath("//td[6]")).getText());
            }
            System.out.println("actual- " + actualFourS + "; expected- " + fourS);
        }
        return fourS==actualFourS;
    }

    public int totalScore(){
        String totalScore = espnCricInfoLocator.score.getText();
        System.out.println(totalScore);
        return 0;
    }

    public int totalWickets(){
        String totalScore = espnCricInfoLocator.score.getText();
        System.out.println(totalScore);
        return 0;
    }

}
