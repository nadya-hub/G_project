package com.selenium.g_project.tests;

import com.selenium.g_project.helpers.ApplicationManager;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;


public class TestBase {

   public static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeClass
    public void setUp(){
        app.init();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        app.stop();
    }



}
