package com.selenium.g_project.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JoinTest extends TestBase {
    @BeforeClass
 public void ensurePreconditionsOpensite() throws InterruptedException {
        app.getSessionHelper().openSiteG_P(); }

    @Test
        public void searchJoinTest() throws InterruptedException {

        app.getJoinG_PHelper().joinByG_P();
       Thread.sleep(8000);
       app.getJoinG_PHelper().NewPage();

    }


}
