package com.selenium.g_project.helpers;

import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {
    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void openSiteG_P() {
        driver.get("https://www.genpact.com/");
    }


}
