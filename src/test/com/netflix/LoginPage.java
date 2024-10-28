package com.netflix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonSignIn() {
        driver.findElement(By.xpath(LoginXpath.BUTTON_SIGN_IN_XPATH)).click();
    }
    public String getEmailInvalidText() {
       return driver.findElement(By.xpath(LoginXpath.ERROR_EMAIL_XPATH)).getText();
        }
    public String getPasswordInvalidText() {
        return driver.findElement(By.xpath(LoginXpath.ERROR_PASSWORD_XPATH)).getText();
    }
    public String getPasswordEmailInvalidText() {
        return driver.findElement(By.xpath(LoginXpath.ERROR_PASSWORD_EMAIL_XPATH)).getText();
    }
    public void sendKeysEmailField(String email){
        driver.findElement(By.xpath(LoginXpath.FIELD_EMAIL_XPATH)).sendKeys(email);
    }
    public void sendKeysPasswordField(String password){
        driver.findElement(By.xpath(LoginXpath.FIELD_PASSWORD_XPATH)).sendKeys(password);
    }




}


