package biz.svyatoslav;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
    @Test
    public void test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNamexpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNamexby = By.xpath(inputNamexpath);
        WebElement inputNamexWebElement = webDriver.findElement(inputNamexby);
        inputNamexWebElement.sendKeys("Ivan");

        String inputHightxpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHightby = By.xpath(inputHightxpath);
        WebElement inputHightWebElement = webDriver.findElement(inputHightby);
        inputHightWebElement.sendKeys("180");

        String inputWeightxpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightxby = By.xpath(inputWeightxpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightxby);
        inputWeightWebElement.sendKeys("70");

        String inputSubmitxpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputSubmitby = By.xpath(inputSubmitxpath);
        WebElement inputSubmitWebElement = webDriver.findElement(inputSubmitby);
        inputSubmitWebElement.click();

        String inputRadioxpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputRadioby = By.xpath(inputRadioxpath);
        WebElement inputRadioWebElement = webDriver.findElement(inputRadioby);
        inputRadioWebElement.click();





    }
}
