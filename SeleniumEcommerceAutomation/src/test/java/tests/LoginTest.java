package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestUtil;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

   @BeforeMethod
    public void setUp() {
        driver = TestUtil.initializeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    public void testInvalidLogin() {
        loginPage.login("invalid_user", "invalid_password");
        Assert.assertTrue(driver.getPageSource().contains("Username and password do not match any user in this service"));
    }

    @AfterMethod
    public void tearDown() {
        TestUtil.tearDown(driver);
    }
}
