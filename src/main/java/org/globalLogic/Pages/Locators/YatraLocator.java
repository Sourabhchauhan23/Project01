package org.globalLogic.Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YatraLocator {

    @FindBy(xpath = "//i[contains(@class, 'HeaderLogo')]")
    public WebElement yatraLogo;
}
