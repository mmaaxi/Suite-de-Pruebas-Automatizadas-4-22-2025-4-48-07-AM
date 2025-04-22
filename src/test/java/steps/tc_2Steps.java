package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_2Page;

import static org.junit.Assert.assertTrue;

public class tc_2Steps {
    WebDriver driver;
    tc_2Page logoutPage;

    @Given("el usuario está en la página principal")
    public void el_usuario_está_en_la_página_principal() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/home");
        logoutPage = new tc_2Page(driver);
    }

    @When("el usuario clickea en el botón de logout")
    public void el_usuario_clickea_en_el_botón_de_logout() {
        logoutPage.clickLogoutButton();
    }

    @Then("el usuario debería ser redirigido a la página de login")
    public void el_usuario_debería_ser_redirigido_a_la_página_de_login() {
        assertTrue(driver.getCurrentUrl().contains("/login"));
        driver.quit();
    }
}