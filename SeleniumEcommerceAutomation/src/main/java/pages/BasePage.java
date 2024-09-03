package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    protected void waitForVisibility(org.openqa.selenium.WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForClickable(org.openqa.selenium.WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void clickElement(org.openqa.selenium.WebElement element) {
        waitForClickable(element);
        element.click();
    }

    public void inputText(org.openqa.selenium.WebElement element, String text) {
        waitForVisibility(element);
        element.clear();
        element.sendKeys(text);
    }

    public boolean isElementDisplayed(org.openqa.selenium.WebElement element) {
        waitForVisibility(element);
        return element.isDisplayed();
    }

    public boolean isElementEnabled(org.openqa.selenium.WebElement element) {
        waitForVisibility(element);
        return element.isEnabled();
    }

    public void waitForURLToContain(String partialURL) {
        wait.until(ExpectedConditions.urlContains(partialURL));
    }
}
