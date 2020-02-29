package com.selenium.g_project.helpers;

import com.selenium.g_project.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JoinG_PHelper extends BaseHelper {

    public JoinG_PHelper(WebDriver driver) { super(driver); }
    public void joinByG_P() throws InterruptedException {

        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Company')]"))).perform();
        click(By.xpath("//div[contains(text(),'Careers')] "));
        Thread.sleep(4000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'QA Engineer')]"))).click()
                .perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'QA Engineer')]"))).perform();
        Thread.sleep(4000);
       new Actions(driver).moveToElement(driver.findElement(By.xpath(" //div[contains(text(),'Products')] "))).perform();
    Thread.sleep(4000);
       click(By.xpath("//div[contains(text(),'VoyagerAnalytics')] "));
       Thread.sleep(4000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='bdt-icon-wrapper']"))).perform();
       new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='bdt-icon-wrapper']"))).click().perform();
        Thread.sleep(6000);

    new Actions(driver).moveToElement(driver.findElement(By.xpath("  //div[@class='uael-content'] "))).perform();
        Thread.sleep(6000);
       new Actions(driver).moveToElement(driver.findElement(By.xpath(" //div[@class='uael-content'] "))).click().perform();
        Thread.sleep(18000);
       click(By.xpath(" //i[@class='fas fa-times']"));
    }

     public void NewPage() throws InterruptedException {

       click(By.xpath(" //a//img[@class='attachment-large size-large'] "));
         Thread.sleep(3000);
      } }

