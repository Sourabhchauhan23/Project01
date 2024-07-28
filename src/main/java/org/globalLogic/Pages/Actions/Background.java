package org.globalLogic.Pages.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.globalLogic.Base.Base;
import org.globalLogic.Utils.Resources;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Background extends Base{

    public Background(){
        setUp("Edge");

    }

    public void openWebsite(String website){
        driver.get(Resources.valueOf(website).getResource());
    }

    public void closeBrowser(){
        tearDown();
    }

    public void screenshot(Scenario scenario) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\Users\\Sourabh\\IdeaProjects\\Project02\\src\\test\\resources\\Screenshots" + scenario + Math.random() * 10 + ".jpeg"));
    }

}
