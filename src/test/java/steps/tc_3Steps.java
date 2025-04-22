package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_3Page;

public class tc_3Steps {
    WebDriver driver;
    tc_3Page registrationPage;
    
    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        driver = Hooks.getDriver();
        registrationPage = PageFactory.initElements(driver, tc_3Page.class);
        registrationPage.navigateToRegistrationPage();
    }
    
    @When("I complete the registration form with valid data")
    public void i_complete_the_registration_form_with_valid_data() {
        registrationPage.completeRegistrationForm("John", "Doe", "john.doe@example.com", "password123");
    }
    
    @Then("I should see a confirmation message stating \"Profile created successfully\"")
    public void i_should_see_a_confirmation_message_stating() {
        assertTrue(registrationPage.isConfirmationMessageDisplayed("Profile created successfully"));
    }

    @Then("a notification should be sent to the registered email")
    public void a_notification_should_be_sent_to_the_registered_email() {
        // This step can be implemented by checking an email API or database for records of sent notifications
        assertTrue(registrationPage.isNotificationSentToEmail("john.doe@example.com"));
    }
}