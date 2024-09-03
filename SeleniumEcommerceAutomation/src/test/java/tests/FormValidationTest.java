package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import pages.CheckoutPage;
import utils.TestUtil;

public class FormValidationTest {

    WebDriver driver;
    LoginPage loginPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    ProductPage productPage;
    @BeforeMethod
    public void setUp() {
        driver = TestUtil.initializeDriver();
        loginPage = new LoginPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        productPage = new ProductPage(driver);
        
    }

    @Test
    public void testFormValidation() {
        loginPage.login("standard_user", "secret_sauce");
        productPage.goToCart();
        cartPage.proceedToCheckout();
        checkoutPage.enterCheckoutDetails("", "Harogoppa", "580062");
        Assert.assertTrue(driver.getPageSource().contains("Error: First Name is required"));
    }
    
    

    @AfterMethod
    public void tearDown() {
        TestUtil.tearDown(driver);
    }
}
