package com.github.mackzwellz.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    //*********Web Elements*********
    By firstLastNameBy = By.xpath("//header[@id='header']/div[2]/div/div/nav/div/a/span");
    By signOutButtonBy = By.linkText("Sign out");
    String pageUrl = "http://automationpractice.com/index.php?controller=my-account";
    String pageTitle = "My account - My Store";

    //http://automationpractice.com/index.php?controller=my-account

    //*********Constructor*********
    public AccountPage(WebDriver driver) {
        super(driver);
    }


    //*********Page Methods*********

    public AccountPage checkPageUrlAndTitle() {
        Assertions.assertEquals(pageUrl, driver.getCurrentUrl());
        Assertions.assertEquals(pageTitle, driver.getTitle());
        return this;
        //ExpectedConditions.urlToBe("http://automationpractice.com/index.php?controller=my-account");
        //ExpectedConditions.titleIs("My account - My Store");
    }

    public boolean checkLogin(String firstName, String lastName) {
        assertEquals(signOutButtonBy, "Sign out");
        assertEquals(firstLastNameBy, firstName + " " + lastName);
        return true;
    }

}
