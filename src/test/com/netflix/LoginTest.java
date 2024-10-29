package com.netflix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void testEmptyFields(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickButtonSignIn();

        Assertions.assertEquals(LoginMessage.INVALID_EMAIL, loginPage.getEmailInvalidText());
        Assertions.assertEquals(LoginMessage.INVALID_PASSWORD, loginPage.getPasswordInvalidText());
    }

    @Test
    public void testEmailFilled(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.sendKeysEmailField("nstsy@yandex.ru");
        loginPage.clickButtonSignIn();

        Assertions.assertEquals(LoginMessage.INVALID_PASSWORD, loginPage.getPasswordInvalidText());
    }

    @Test
    public void testEmailPasswordFilled(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.sendKeysEmailField("nstsy@yandex.ru");
        loginPage.sendKeysPasswordField("555111999");
        loginPage.clickButtonSignIn();

        Assertions.assertEquals(LoginMessage.INVALID_EMAIL_PASSWORD, loginPage.getPasswordEmailInvalidText());
    }
}
