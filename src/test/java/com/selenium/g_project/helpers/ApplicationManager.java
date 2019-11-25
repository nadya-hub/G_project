package com.selenium.g_project.helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

     SearchG_PHelper searchG_PHelper;
     SessionHelper sessionHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }
        if(browser.equals(BrowserType.FIREFOX)){
            driver= new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        searchG_PHelper = new SearchG_PHelper(driver);
        sessionHelper = new SessionHelper(driver);
    }

    public void stop() {
        driver.quit();
    }



    public SearchG_PHelper getSearchG_PHelper() { return searchG_PHelper; }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
