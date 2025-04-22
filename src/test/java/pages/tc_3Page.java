package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_3Page {
    WebDriver driver;
    
    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "registerButton")
    WebElement registerButton;

    @FindBy(id = "confirmationMessage")
    WebElement confirmationMessage;

    public tc_3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRegistrationPage() {
        driver.get("http://example.com/register");
    }

    public void completeRegistrationForm(String firstName, String lastName, String email, String password) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        registerButton.click();
    }

    public boolean isConfirmationMessageDisplayed(String expectedMessage) {
        return confirmationMessage.isDisplayed() && confirmationMessage.getText().equals(expectedMessage);
    }

    public boolean isNotificationSentToEmail(String email) {
        // Simulate a method to check notification has been sent
        return true;
    }
}