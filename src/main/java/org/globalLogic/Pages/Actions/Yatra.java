package org.globalLogic.Pages.Actions;

import org.globalLogic.Base.Base;
import org.globalLogic.Pages.Locators.YatraLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Yatra extends Base {
    public static YatraLocator yatraLocator;

    public Yatra(){
        yatraLocator = new YatraLocator();
        AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(ajaxElementLocatorFactory, yatraLocator);
    }

    public void verifyWebsite(){
        isElementPresent(yatraLocator.yatraLogo);
    }
}
