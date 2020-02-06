package com.selenium.g_project.helpers;

import com.selenium.g_project.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JoinG_PHelper extends BaseHelper {


    public JoinG_PHelper(WebDriver driver) { super(driver);
    }


    public void joinByG_P() throws InterruptedException {
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-language menu-item-3649'] "))).click().perform();
        Thread.sleep(6000);
        click(By.xpath("//li[@class='lang-item lang-item-36 lang-item-de menu-item menu-item-type-custom menu-item-object-custom menu-deutsch menu-item-2134-de']//a//span//span[contains(text(),'Deutsch')] "));
        Thread.sleep(6000);
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-sprache menu-item-3650']  "))).click().perform();
        Thread.sleep(6000);
        click(By.xpath("//li[@class='lang-item lang-item-31 lang-item-en lang-item-first menu-item menu-item-type-custom menu-item-object-custom menu-english menu-item-2136-en']//a//span//span[contains(text(),'English')]  "));
        Thread.sleep(6000);
        click(By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-contact-us menu-item-115']//a  "));
        Thread.sleep(6000);
        type(By.xpath("//input[@id='form-field-1-2'] "),"972-537217290-");
        type(By.xpath("//input[@id='form-field-1-3']"),"My_JoB");
        type(By.xpath("//input[@id='form-field-1-4']"),"My_JoB@gmail.com");
        Thread.sleep(4000);
        click(By.xpath("//button[@class='button submit size-medium']  "));
    }

    public void NewPage() throws InterruptedException {
        click(By.xpath("//img[@class='logo-img-primary pojo-hidden-phone'] "));
        click(By.xpath("//div[@id='slider-2-layer-6']//i[@class='revicon-right-dir'] "));
       // Thread.sleep(15000);
    }
}
