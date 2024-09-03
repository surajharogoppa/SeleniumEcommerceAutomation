package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement cartLink;

    public ProductPage(WebDriver driver) {
        super(driver);
        
    }
   
    public void addProductToCart() {
       
        addToCartButton.click();
    }


    public void goToCart() {
        cartLink.click();
    }
}
