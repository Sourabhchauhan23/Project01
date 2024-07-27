package org.globalLogic.Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EspnCricInfoLocator {

    @FindBy(xpath = "//img[@alt='ESPNcricinfo']")
    public WebElement ESPNcricinfo;

    @FindBy(xpath = "//div[@class='ds-rounded-lg ds-mt-2'][1]/descendant::span[contains(text(),'Lucknow Super Giants')]")
    public WebElement lucknowSuperGaintsHead;

    @FindBy(xpath = "//div[@class='ds-rounded-lg ds-mt-2'][1]/descendant::span[contains(text(),'Lucknow Super Giants')]/parent::span/parent::div/parent::div/following-sibling::div/table")
    public WebElement lucknowSuperGaintsScoreTable;




}
