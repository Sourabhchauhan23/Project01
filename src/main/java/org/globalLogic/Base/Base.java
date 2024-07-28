package org.globalLogic.Base;


import io.cucumber.java.After;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Base {

    public static WebDriver driver;

    public static void setUp(String browser){
        if(browser.equals("Edge")){
            driver = new EdgeDriver();
        }else if (browser.equals("Chrome")){
            driver = new ChromeDriver();
        }else{
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    public static void navigateTo(String website) throws InterruptedException {
        driver.get(website);
        Thread.sleep(10000);
    }

    @After
    public static void tearDown(){
        driver.close();
        driver.quit();
    }

    public static void click(WebElement webElement){
        webElement.click();
    }

    public static void type(WebElement webElement, String text){
        webElement.sendKeys(text);
    }

    public static boolean isElementPresent(WebElement webElement){
        return webElement.isDisplayed();
    }

    //finds webelement from list of webelements depending on predicate
    public static WebElement findWebElement(Predicate<WebElement> predicate, List<WebElement> webElementList){
        WebElement result = null;
        for (WebElement t : webElementList) {
            if(t.getAttribute("href")!=null) {
                if (predicate.test(t)) {
                    result = t;
                    break;
                }
            }
        }
        return result;
    }

    public void openLinkInNewtab(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(webElement).build().perform();
    }

    public void navigateToTab(String Title){
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        for(String tab : tabs){
            driver.switchTo().window(tab);
            if(driver.getTitle().contains(Title)) {
                break;
            }
        }
    }

    }



