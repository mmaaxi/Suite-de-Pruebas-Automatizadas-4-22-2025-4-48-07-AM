package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_10Page;
import org.junit.Assert;

public class tc_10Steps {

    tc_10Page performancePage = new tc_10Page();

    @Given("el sistema está operativo")
    public void el_sistema_está_operativo() {
        performancePage.openApplication();
    }

    @When("simulo una carga de 1000 usuarios concurrentes")
    public void simulo_una_carga_de_1000_usuarios_concurrentes() {
        performancePage.simulateUsersLoad(1000);
    }

    @Then("el sistema sigue funcionando sin caídas")
    public void el_sistema_sigue_funcionando_sin_caídas() {
        Assert.assertTrue(performancePage.isSystemResponsive());
    }
}