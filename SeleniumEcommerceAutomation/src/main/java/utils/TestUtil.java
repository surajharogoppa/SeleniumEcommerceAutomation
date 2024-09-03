package utils;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import config.Config;


public class TestUtil {
	
	
    public static WebDriver initializeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(Config.BASE_URL);
        driver.manage().window().maximize();
        return driver;
    }

    @AfterMethod
	public static void tearDown(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
