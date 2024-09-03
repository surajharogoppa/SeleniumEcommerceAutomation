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

public class FunctionalTest {

    WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    @BeforeMethod
    public void setUp() {
        driver = TestUtil.initializeDriver();
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @Test
    public void testAddProductToCartAndCheckout() {
        loginPage.login("standard_user", "secret_sauce");
        productPage.addProductToCart();
        productPage.goToCart();
        cartPage.proceedToCheckout();
        checkoutPage.enterCheckoutDetails("John", "Doe", "12345");
        checkoutPage.finishCheckout();
        Assert.assertTrue(checkoutPage.isOrderComplete());
    }

    @AfterMethod
    public void tearDown() {
        TestUtil.tearDown(driver);
    }
}
