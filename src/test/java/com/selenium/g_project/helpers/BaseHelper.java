package com.selenium.g_project.helpers;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class BaseHelper {

    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    public void takeScreenshot(){
        File tmp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screen = new File("src/test/resources/Screenshots/screen "+System.currentTimeMillis()+".png");
        try {
            Files.copy(tmp,screen);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
