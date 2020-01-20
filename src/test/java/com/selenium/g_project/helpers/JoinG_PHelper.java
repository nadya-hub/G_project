package com.selenium.g_project.helpers;

import com.selenium.g_project.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class JoinG_PHelper extends BaseHelper {


    public JoinG_PHelper(WebDriver driver) { super(driver);
    }


    public void joinByG_P() throws InterruptedException {

        new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Content Hub')]"))).click().perform();
        Thread.sleep(6000);
        click(By.xpath("//a[@class='nav-link sign-in']"));
        Thread.sleep(6000);
        type(By.xpath("//input[@placeholder='name@company.com'] "),"MYjob@happy.com");
        type(By.xpath("//input[@placeholder='Password']"),"1234567g");
        Thread.sleep(6000);
        click(By.xpath("//button[@class='js_submit button blue submit-button'] "));
    }

    public void refreshPage() {
        click(By.xpath("//a[contains(text(),'Learn more')] "));
    }
}
