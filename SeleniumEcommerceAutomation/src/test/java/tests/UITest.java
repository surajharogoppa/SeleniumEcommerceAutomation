package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.TestUtil;

public class UITest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = TestUtil.initializeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }



@Test
public void testPageTitle() {
    String expectedTitle = "Swag Labs";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(expectedTitle, actualTitle, "Page title does not match.");
    
    String pageSource = driver.getPageSource();
    Assert.assertTrue(pageSource.contains("Sauce Labs Swag Labs app"), "Text not found on the page.");
    
    WebElement loginButton = driver.findElement(By.id("login-button"));
    Assert.assertNotNull(loginButton, "Login button not found.");
    
    //WebElement loginButton = driver.findElement(By.id("login-button"));
    Assert.assertTrue(loginButton.isDisplayed(), "Login button is not visible.");
	}

    @AfterMethod
    public void tearDown() {
        TestUtil.tearDown(driver);
    }
}