package com.github.mackzwellz.pages;
// Based on: https://www.swtestacademy.com/page-object-model-java/ / https://github.com/swtestacademy/POMJAVAExample

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    //*********Page Variables*********
    String baseURL = "http://automationpractice.com/";
    //*********Web Elements*********
    By signInButtonBy = By.linkText("Sign in");

    //*********Constructor*********
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //*********Page Methods*********
    //Go to Homepage
    public HomePage goToHomePage() {
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage() {
        click(signInButtonBy);
        return new LoginPage(driver);
    }
}