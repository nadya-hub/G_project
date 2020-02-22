package com.selenium.g_project.helpers;

import com.selenium.g_project.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JoinG_PHelper extends BaseHelper {


    public JoinG_PHelper(WebDriver driver) { super(driver); }
    public void joinByG_P() throws InterruptedException {
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Company')]"))).perform();
        Thread.sleep(4000);
        click(By.xpath("//div[contains(text(),'Careers')]"));
        Thread.sleep(6000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//div[contains(@class,'bdt-active')]//div[2]//div[2]//div[1]//ul[1]//li[3]//a[1]   "))).perform();
        Thread.sleep(6000);
        click(By.xpath(".//div[contains(text(),'QA Engineer')] "));
        Thread.sleep(6000);
        click(By.xpath("//a//img[@class='attachment-large size-large']  "));
        Thread.sleep(6000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Products')]"))).perform();

        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'VoyagerAnalytics')]   "))).click().perform();
        Thread.sleep(4000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='bdt-icon-wrapper']//img "))).click().perform();
        Thread.sleep(4000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='bdt-icon-wrapper']//img "))).click().perform();

    }
        public void NewPage() throws InterruptedException {
            new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[@class='bdt-icon-wrapper']//img "))).click().perform();
        }

    }
//    public void joinByG_P() throws InterruptedException {
//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Company')]"))).perform();
//        Thread.sleep(4000);
//        click(By.xpath("//div[contains(text(),'Careers')]"));
//        Thread.sleep(6000);
//        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//div[contains(@class,'bdt-active')]//div[2]//div[2]//div[1]//ul[1]//li[3]//a[1]   " ))).perform();
//
//        Thread.sleep(6000);
//        click(By.xpath(".//div[contains(text(),'QA Engineer')] "));
//        Thread.sleep(10000);
//       click(By.xpath("//body[@class='page-template-default page page-id-2060 ast-desktop ast-page-builder-template ast-no-sidebar astra-2.3.0 ast-header-custom-item-inside group-blog ast-single-post ast-inherit-site-logo-transparent elementor-default elementor-kit-4597 elementor-page elementor-page-2060 astra-addon-2.3.1 jet-desktop-menu-active cookies-set cookies-accepted'] "));
//      type(By.xpath("//body[@class='page-template-default page page-id-2060 ast-desktop ast-page-builder-template ast-no-sidebar astra-2.3.0 ast-header-custom-item-inside group-blog ast-single-post ast-inherit-site-logo-transparent elementor-default elementor-kit-4597 elementor-page elementor-page-2060 astra-addon-2.3.1 jet-desktop-menu-active cookies-set cookies-accepted']  "),"Nadezda");
//         }
//      public void NewPage() throws InterruptedException {
//       click(By.xpath("//a//img[@class='attachment-large size-large']  "));
//
//      }

