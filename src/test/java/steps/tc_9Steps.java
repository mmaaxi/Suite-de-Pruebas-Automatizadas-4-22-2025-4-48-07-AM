package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_9Page;
import static org.junit.Assert.assertTrue;

public class tc_9Steps {
    private WebDriver driver;
    private tc_9Page page;

    @Given("El usuario no está autenticado")
    public void el_usuario_no_esta_autenticado() {
        driver = new ChromeDriver();
        page = new tc_9Page(driver);
        driver.get("http://example.com/login");
    }

    @When("El usuario intenta acceder a una página protegida")
    public void el_usuario_intenta_acceder_a_una_pagina_protegida() {
        page.navigateToProtectedPage();
    }

    @Then("El acceso es denegado")
    public void el_acceso_es_denegado() {
        assertTrue(page.isAccessDenied());
    }

    @Then("Un mensaje de error es mostrado")
    public void un_mensaje_de_error_es_mostrado() {
        assertTrue(page.isErrorMessageDisplayed());
        driver.quit();
    }
}