package com.github.mackzwellz.pages;
// Based on: https://www.swtestacademy.com/page-object-model-java/ / https://github.com/swtestacademy/POMJAVAExample

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //*********Web Elements*********
    By usernameBy = By.id("email");
    By passwordBy = By.id("passwd");
    By loginButtonBy = By.id("SubmitLogin");

    //http://automationpractice.com/index.php?controller=authentication&back=my-account

    //*********Constructor*********
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //*********Page Methods*********

    public AccountPage signIn(String username, String password) {
        //Enter Username(Email)
        writeText(usernameBy, username);
        //Enter Password
        writeText(passwordBy, password);
        //Click Login Button
        click(loginButtonBy);
        return new AccountPage(driver);
    }

}
