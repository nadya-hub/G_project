package com.selenium.g_project.helpers;

import com.selenium.g_project.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchG_PHelper extends BaseHelper {


    public SearchG_PHelper(WebDriver driver) { super(driver);
    }


    public void searchByG_P() {
        click(By.xpath("//button[@class='navigation-header__button navigation-header__button--desktop-search']//i[@class='icon icon-search'] "));
        type(By.id("searchBar"),"MY job.");
    }

    public void refreshPage() {
        click(By.xpath("//img[@class='navigation-header__logo navigation-header__logo--desktop'] "));
    }
}
