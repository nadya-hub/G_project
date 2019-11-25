package com.selenium.g_project.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeClass
 public void ensurePreconditionsOpensite() throws InterruptedException {
        app.getSessionHelper().openSiteG_P(); }

    @Test
        public void searchWikiTest() throws InterruptedException {


        app.getSearchG_PHelper().searchByG_P();
        Thread.sleep(6000);
        app.getSearchG_PHelper().refreshPage();
        Thread.sleep(6000);
    }


}
