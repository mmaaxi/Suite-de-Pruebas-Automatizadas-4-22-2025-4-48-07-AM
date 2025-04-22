package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_5Page {

    WebDriver driver;

    By productLocator = By.cssSelector("selector_for_product");
    By addToCartLocator = By.cssSelector("selector_for_add_to_cart_button");
    By cartConfirmationLocator = By.cssSelector("selector_for_cart_confirmation");

    public tc_5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProduct() {
        driver.findElement(productLocator).click();
    }

    public void addToCart() {
        driver.findElement(addToCartLocator).click();
    }

    public boolean isProductAddedToCart() {
        return driver.findElement(cartConfirmationLocator).isDisplayed();
    }
}