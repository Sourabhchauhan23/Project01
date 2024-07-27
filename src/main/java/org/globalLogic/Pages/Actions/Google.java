package org.globalLogic.Pages.Actions;

import org.globalLogic.Base.Base;
import org.globalLogic.Pages.Locators.GoogleLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.util.List;
import java.util.function.Predicate;

public class Google extends Base {

    public GoogleLocator googleLocator;

    public Google(){
        googleLocator = new GoogleLocator();
        AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(ajaxElementLocatorFactory,googleLocator);
    }

    public void googleSearch(String inputText){
        type(googleLocator.searchBar,inputText);
    }

    public void verifySearchOptions(String inputText){
        List<WebElement> webElements=googleLocator.searchOption;
        for(WebElement webElement : webElements){
            System.out.println(webElement.getAttribute("data-entityname"));
            if(webElement.getAttribute("data-entityname").contains(inputText)){
                click(webElement);
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void findAndOpenWebsiteInNewTab(String website) {
        List<WebElement> webElementList = googleLocator.allLinks;
        Predicate predicate = x -> x.toString().contains(website);
        WebElement url = findWebElement(predicate, webElementList);
        System.out.println(url.getAttribute("href"));
        openLinkInNewtab(url);
        navigateToTab(website);
    }


}
