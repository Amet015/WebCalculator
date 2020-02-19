package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private WebDriver webDriver;
    private static WebDriverManager webDriverManager;

    private WebDriverManager(){
        this.webDriver = new ChromeDriver();
    }
    public static WebDriverManager getInstance(){
        if (webDriverManager == null || webDriverManager.webDriver == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }
    public WebDriver getWebDriver(){
        return this.webDriver;
    }
    public void quitWebDriver(){
        webDriver.quit();
        webDriver = null;
    }
}
