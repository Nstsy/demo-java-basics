package by.emall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void acceptCookies() {
        try {
            WebElement cookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginXpath.BUTTON_COOCKIE_XPATH)));
            if (cookiesButton.isDisplayed()) {
                cookiesButton.click();
            }
        } catch (Exception e) {
            System.out.println("Кнопка Куки не найдена");
        }
    }

    public void clickButtonSignIn() {
        driver.findElement(By.xpath(LoginXpath.BUTTON_SIGNIN_XPATH)).click();
    }

    public void sendKeysTelephone(String telephone) {
        driver.findElement(By.xpath(LoginXpath.INPUT_TELEPHONE_XPATH)).sendKeys(telephone);
    }

    public void sendKeysPassword(String password) {
        driver.findElement(By.xpath(LoginXpath.INPUT_PASSWORD_XPATH)).sendKeys(password);
    }

    public String getTextEmptyFields() {
        WebElement textEmptyFields = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(LoginXpath.EMPTY_FIELDS_CLASS)));
        return textEmptyFields.getText();
    }

    public String getTextEmptyPassword() {
        WebElement textEmptePassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(LoginXpath.EMPTY_PASSWORD_CLASS)));
        return textEmptePassword.getText();
    }

    public String getTestEmptyTelephone() {
        WebElement textEmptyTelephone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(LoginXpath.EMPTY_TELEPHONE_CLASS)));
        return textEmptyTelephone.getText();
    }

    public String getTextInvaledData() {
        WebElement textInvaledData = wait.until(ExpectedConditions.visibilityOfElementLocated((By.className(LoginXpath.INVALID_DATA_CLASS))));
        return textInvaledData.getText();
    }
}
