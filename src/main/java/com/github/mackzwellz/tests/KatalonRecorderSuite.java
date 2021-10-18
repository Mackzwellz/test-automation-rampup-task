// Most of the code below is generated by Katalon Recorder extension for Chrome. Leaving it here for demo purposes.
// https://chrome.google.com/webstore/detail/katalon-recorder-selenium/ljdobmomdgdljniojadhoplhkpialdid

package com.github.mackzwellz.tests;

import com.github.mackzwellz.TestAutomationSupport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KatalonRecorderSuite extends TestAutomationSupport {
    static String userEmail;
    static String userLastName;
    private final StringBuffer verificationErrors = new StringBuffer();
    //    JavascriptExecutor js;
    //    private WebDriver driver;
    //    private String baseUrl;
    private boolean acceptNextAlert = true;

    @BeforeAll
    public static void setUp() throws Exception {
//        System.setProperty("webdriver.gecko.driver", "Your Gecko driver path");
//        driver = new FirefoxDriver();
//        baseUrl = "https://www.google.com/";
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        js = (JavascriptExecutor) driver;
        userEmail = generateUserEmail();
        userLastName = generateUserName();
    }

    @Test
    public void RegistrationTest() throws Exception {
        System.out.println("[TEST LOG] Generated data:"+userEmail+","+userLastName);

        //http://automationpractice.com/index.php
        //"My Store"
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.linkText("Sign in")).click();

        //http://automationpractice.com/index.php?controller=authentication&back=my-account

        //.urlContains("#account-creation")
        //.titleContains("Login - My Store")

        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).clear();
        driver.findElement(By.id("email_create")).sendKeys(userEmail);
        driver.findElement(By.xpath("//button[@id='SubmitCreate']/span")).click();

        //http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submitAccount")));
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).clear();
        driver.findElement(By.id("customer_firstname")).sendKeys("fn");
        driver.findElement(By.id("customer_lastname")).clear();
        driver.findElement(By.id("customer_lastname")).sendKeys(userLastName);
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("123pw");
        driver.findElement(By.id("days")).click();
        new Select(driver.findElement(By.id("days"))).selectByVisibleText("1  ");
        //wait.until(ExpectedConditions.elementToBeClickable(daysDropdown.selectByVisibleText("regexp:1\\s+"));
        //Select daysDropdown = new Select(driver.findElement(By.id("days")));
        //daysDropdown.selectByVisibleText("1  ");
        driver.findElement(By.id("months")).click();
        new Select(driver.findElement(By.id("months"))).selectByVisibleText("January ");
        driver.findElement(By.id("years")).click();
        new Select(driver.findElement(By.id("years"))).selectByVisibleText("2002  ");
        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys("STREET 1");
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("city 1");
        driver.findElement(By.id("id_state")).click();
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Arizona");
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).clear();
        driver.findElement(By.id("postcode")).sendKeys("12312");
        driver.findElement(By.id("id_country")).click();
        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys("9999999999");
        driver.findElement(By.xpath("//button[@id='submitAccount']/span")).click();

        //http://automationpractice.com/index.php?controller=my-account

        try {
            assertEquals("Sign out", driver.findElement(By.linkText("Sign out")).getText());
        } catch (Error e) {
            verificationErrors.append(e);
        }

        try {
            assertEquals("fn "+userLastName, driver.findElement(By.xpath("//header[@id='header']/div[2]/div/div/nav/div/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e);
        }
    }

    @Test
    public void LoginTest() throws Exception {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();

        //http://automationpractice.com/index.php?controller=authentication&back=my-account

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(userEmail);
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("123pw");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        try {
            assertEquals("Sign out", driver.findElement(By.linkText("Sign out")).getText());
        } catch (Error e) {
            verificationErrors.append(e);
        }
        try {
            assertEquals("fn "+userLastName, driver.findElement(By.xpath("//header[@id='header']/div[2]/div/div/nav/div/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e);
        }
    }

//    @AfterAll
//    public static void tearDown() throws Exception {
//        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString)) {
//            fail(verificationErrorString);
//        }
//    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}