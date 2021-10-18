package com.github.mackzwellz.pages;
// Based on: https://www.swtestacademy.com/page-object-model-java/ / https://github.com/swtestacademy/POMJAVAExample

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        } catch (Exception e) {
            System.out.println("[TEST LOG] Timed out while waiting for: " + elementBy.toString());
        }
    }

    //Click Method
    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text
    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text
    public String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
    public void assertEquals(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assertions.assertEquals(readText(elementBy), expectedText);
    }
}