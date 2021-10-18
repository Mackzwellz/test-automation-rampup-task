package com.github.mackzwellz;

import com.mifmif.common.regex.Generex;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class TestAutomationSupport {

    public WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    }

    public static String generateUserName() {
        return "ln" + new Generex("[A-z]{10}").random();
    }

    public static String generateUserEmail() {
        return "tart_user+" + getAndFormatCurrentTime() + "@chainletters.com"; //tart_user+2021-10-18_00-35-56@chainletters.com
    }

    public static String getAndFormatCurrentTime() {
        return LocalDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
    }

    //@AfterAll
    public void tearDown() throws Exception {
        driver.quit();
    }

}
