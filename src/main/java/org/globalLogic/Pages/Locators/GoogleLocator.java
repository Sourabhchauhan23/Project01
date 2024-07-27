package org.globalLogic.Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GoogleLocator {

    @FindBy(xpath = "//textarea[@role='combobox']")
    public WebElement searchBar;

//    @FindBy(tagName = "//a")
    @FindBy(tagName = "a")
    public List<WebElement> allLinks;

    @FindBy(xpath = "//ul[@role='listbox']/li")
    public List<WebElement> searchOption;

}
