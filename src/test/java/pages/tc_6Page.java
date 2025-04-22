package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_6Page {
    private WebDriver driver;

    @FindBy(id = "card-number")
    private WebElement cardNumberInput;

    @FindBy(id = "card-expiry")
    private WebElement cardExpiryInput;

    @FindBy(id = "card-cvv")
    private WebElement cardCvvInput;

    @FindBy(id = "pay-button")
    private WebElement payButton;

    @FindBy(id = "order-confirmation")
    private WebElement orderConfirmationMessage;

    @FindBy(id = "payment-success")
    private WebElement paymentSuccessMessage;

    public tc_6Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToPagoPage() {
        driver.get("http://example.com/pago");
    }

    public void enterCardDetails(String cardNumber, String expiryDate, String cvv) {
        cardNumberInput.sendKeys(cardNumber);
        cardExpiryInput.sendKeys(expiryDate);
        cardCvvInput.sendKeys(cvv);
    }

    public void submitPago() {
        payButton.click();
    }

    public boolean isPagoSuccessful() {
        return paymentSuccessMessage.isDisplayed();
    }

    public boolean isOrdenConfirmada() {
        return orderConfirmationMessage.isDisplayed();
    }
}