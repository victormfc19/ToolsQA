package co.com.practica.toolsqa.util.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;

    public static Driver getDriver(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized","--disable-infobars");
        driver = new ChromeDriver(options);
        return new Driver();
    }

    public WebDriver openUrl(String url){
        driver.get(url);
        return driver;
    }
}
