package com.selenium.g_project.helpers;

import com.selenium.g_project.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JoinG_PHelper extends BaseHelper {

//    public JoinG_PHelper(WebDriver driver) { super(driver); }
//    public void joinByG_P() throws InterruptedException {
//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Company')]"))).perform();
//        Thread.sleep(4000);
//        click(By.xpath("//div[contains(text(),'Careers')]"));
//        Thread.sleep(6000);
//        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//div[contains(@class,'bdt-active')]//div[2]//div[2]//div[1]//ul[1]//li[3]//a[1]   "))).perform();
//        Thread.sleep(6000);
//        click(By.xpath(".//div[contains(text(),'QA Engineer')] "));
//        Thread.sleep(6000);
//        click(By.xpath("//a//img[@class='attachment-large size-large']  "));
//        Thread.sleep(6000);
//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Products')]"))).perform();
//
//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'VoyagerAnalytics')]   "))).click().perform();
//        Thread.sleep(4000);
//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='bdt-icon-wrapper']//img "))).click().perform();
//        Thread.sleep(4000);
//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='bdt-icon-wrapper']//img "))).click().perform();
//
//    }
//        public void NewPage() throws InterruptedException {
//            new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='bdt-icon-wrapper']//img "))).click().perform();
//            Thread.sleep(4000);
//        }
//
//    }
    public JoinG_PHelper(WebDriver driver) { super(driver); }
    public void joinByG_P() throws InterruptedException {
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'RESOURCES')]"))).perform();
        click(By.xpath("//a[@class='nav__dropdown-link'][contains(text(),'Videos')] "));
        Thread.sleep(4000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath(" //div[@class='container']//div[1]//div[1]//a[1]//div[1] "))).click().perform();
      Thread.sleep(8000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath(" //body[@class='single single-resource_center postid-4568 see-how-rbc-uses-personetics-to-deliver-ai-powered-financial-guidance-and-automated-savings']  "))).click().perform();
//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[4]//div[2]//div[1]//ul[1]//li[3]//a[1] " ))).click().perform();
     Thread.sleep(10000);
        click(By.xpath("//li[@id='menu-item-5007']//a[contains(text(),'Contact Us')] "));
        Thread.sleep(6000);
        type(By.xpath("//input[@id='input_3_10'] "),"Nadezda");
        type(By.xpath(" //input[@id='input_3_11']"),("Serenok"));
        Thread.sleep(6000);
        type(By.xpath("  //input[@id='input_3_2']"),("4565890"));
        type(By.xpath("  //input[@id='input_3_3']"),("MyJob@com"));
        Thread.sleep(6000);
        click(By.xpath("//input[@id='gform_submit_button_3']"));
        }
     public void NewPage() throws InterruptedException {

       click(By.xpath(" //a[@class='logo']"));
         Thread.sleep(4000);
      } }

