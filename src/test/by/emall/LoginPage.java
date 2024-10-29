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

    public void sendKeysTelephone(String telephone){
        driver.findElement(By.xpath(LoginXpath.INPUT_TELEPHONE_XPATH)).sendKeys(telephone);
    }

    public void sendKeysPassword(String password){
        driver.findElement(By.xpath(LoginXpath.INPUT_PASSWORD_XPATH)).sendKeys(password);
    }

    public String getTextEmptyFields() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver.findElement(By.className(LoginXpath.EMPTY_FIELDS_XPATH)).getText();
    }

    public String getTextEmptyPassword(){
       return driver.findElement(By.xpath(LoginXpath.EMPTY_PASSWORD_XPATH)).getText();
    }

    public String getTestEmptyTelephone(){
        return driver.findElement(By.xpath(LoginXpath.EMPTY_TELEPHONE_XPATH)).getText();
    }

    public String getTextInvaledData(){
        return driver.findElement(By.xpath(LoginXpath.INVALID_DATA_XPATH)).getText();
    }
}
