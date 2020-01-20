package com.selenium.g_project.helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;

     JoinG_PHelper joinG_PHelper;
     SessionHelper sessionHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() throws InterruptedException {
        if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }
        if(browser.equals(BrowserType.FIREFOX)){
            driver= new FirefoxDriver();
        }

       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        joinG_PHelper = new JoinG_PHelper(driver);
        sessionHelper = new SessionHelper(driver);
    }

    public void stop() {
        driver.quit();
    }



    public JoinG_PHelper getJoinG_PHelper() { return joinG_PHelper; }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
