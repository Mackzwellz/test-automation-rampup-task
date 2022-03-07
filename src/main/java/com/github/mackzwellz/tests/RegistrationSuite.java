package com.github.mackzwellz.tests;

import com.github.mackzwellz.pages.AccountPage;
import com.github.mackzwellz.pages.HomePage;
import com.github.mackzwellz.pages.LoginPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RegistrationSuite extends KatalonRecorderSuite {

    public static Stream<Arguments> userEmailAndLastNameProvider() {
        return Stream.of(
                arguments(userEmail, userLastName),
                arguments("asdf1@mail.asdf", "ln")
        );
    }

//    @ParameterizedTest(name = "#{index} - Test with user : {0}")
//    @MethodSource("userEmailProvider")
//    public void RegistrationUiTest(String userEmail) {
//    }

    @ParameterizedTest(name = "#{index} - Test with user : {0},{1}")
    @MethodSource("userEmailAndLastNameProvider")
    public void ParametrizedLoginTest(String userEmail, String userLastName) throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        LoginPage loginPage = homePage.goToLoginPage();
        AccountPage accountPage = loginPage.signIn(userEmail, "123pw");
        accountPage.checkPageUrlAndTitle().checkLogin("fn", userLastName);
    }

}
