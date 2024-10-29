package by.emall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void testEmptyFields(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonSignIn();
        loginPage.acceptCookies();
        Assertions.assertEquals(LoginMessage.EMPTY_FIELDS, loginPage.getTextEmptyFields());
    }

    @Test
    public void testFillTelephoneNumber(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysTelephone("292305623");
        loginPage.clickButtonSignIn();
        loginPage.acceptCookies();
        Assertions.assertEquals(LoginMessage.EMPTY_PASSWORD, loginPage.getTextEmptyPassword());
    }

    @Test
    public void testFillPassword(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysPassword("rrr11");
        loginPage.clickButtonSignIn();
        loginPage.acceptCookies();
        Assertions.assertEquals(LoginMessage.EMPTY_TELEPHONE, loginPage.getTestEmptyTelephone());
    }

    @Test
    public void testInvalidData(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysPassword("rrr11");
        loginPage.sendKeysTelephone("292563256");
        loginPage.clickButtonSignIn();
        loginPage.acceptCookies();
        Assertions.assertEquals(LoginMessage.INVALID_DATA, loginPage.getTextInvaledData());
    }
}
