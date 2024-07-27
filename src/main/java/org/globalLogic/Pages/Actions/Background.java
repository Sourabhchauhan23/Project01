package org.globalLogic.Pages.Actions;

import org.globalLogic.Base.Base;
import org.globalLogic.Utils.Resources;

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

}
