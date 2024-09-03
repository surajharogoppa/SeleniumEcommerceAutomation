package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "first-name")
    WebElement firstNameField;

    @FindBy(id = "last-name")
    WebElement lastNameField;

    @FindBy(id = "postal-code")
    WebElement postalCodeField;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "finish")
    WebElement finishButton;

    @FindBy(xpath = "//h2[contains(text(), 'Thank you for your order!')]")
    WebElement orderCompleteMessage;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void enterCheckoutDetails(String firstName, String lastName, String postalCode) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(postalCode);
        continueButton.click();
    }

    public boolean isOrderComplete() {
        return orderCompleteMessage.isDisplayed();
    }

    public void finishCheckout() {
        finishButton.click();
    }
}
