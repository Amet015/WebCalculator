package Calculator;

import Core.ExtractValue;
import Core.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class CalculatorPage {
    private WebDriver driver;
    private static final String URL = "https://www.calculadora.org/";
    private static final By SCREEN_BY = By.cssSelector(".screen");

    public CalculatorPage() {
        driver = WebDriverManager.getInstance().getWebDriver();
    }

    public String getResult() {
        return driver.findElement(SCREEN_BY).getText();
    }

    public String calculate(String digitsCalulator) {
        ExtractValue extractValue = new ExtractValue();
        driver.get(URL);
        driver.manage().window().setSize(new Dimension(1696, 1026));
        for (char digit : digitsCalulator.toCharArray()) {
            driver.findElement(By.xpath(extractValue.getDigit(digit))).click();
        }
        String result = getResult();
        WebDriverManager.getInstance().quitWebDriver();
        return result;
    }
}
