package org.globalLogic.Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EspnCricInfoLocator {

    @FindBy(xpath = "//img[@alt='ESPNcricinfo']")
    public WebElement ESPNcricinfo;

    @FindBy(xpath = "//div[@class='ds-rounded-lg ds-mt-2'][1]/descendant::span[contains(text(),'Lucknow Super Giants')]/parent::span/parent::div/parent::div/following-sibling::div/table")
    public WebElement lucknowSuperGaintsScoreTable;

    @FindBy(xpath = "//div[@class='ds-rounded-lg ds-mt-2'][1]/descendant::span[contains(text(),'Lucknow Super Giants')]/parent::span/parent::div/parent::div/following-sibling::div/table[1]/tbody/tr")
    public List<WebElement> allBatsmanStats;

    @FindBy(xpath = "//div[@class='ds-rounded-lg ds-mt-2'][1]/descendant::table[1]/tbody/tr[16]/td[3]")
    public WebElement score;

}
