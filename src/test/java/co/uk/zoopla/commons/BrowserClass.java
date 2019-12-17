package co.uk.zoopla.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserClass extends DriverClass {
    private WebDriver initChrome()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }
    private WebDriver initHeadless()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu","--headless") ;
        return new ChromeDriver(options);

    }

    private WebDriver initiFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    private WebDriver initFirefoxHeadless()
    {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-gpu","--headless") ;
        return new FirefoxDriver(options);

    }
    private WebDriver initInternetExplorer()
    {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();

    }

    public void launchbrower(String brower) {
        switch (brower) {
            case "Chrome":
                driver = initChrome();
                break;
            case "headless":
                driver = initHeadless();
                break;
            case "IE":
            case "InternetExplorer":
            case "ie":
                case "Internet Explorer";
                driver = initInternetExplorer();
                break;
                case "Firefox";
                driver = initiFirefox();
                break;
            default:
                driver = initChrome();
        }
    }

}