package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_6Page;
import org.junit.Assert;

public class tc_6Steps {
    private tc_6Page pagoPage;

    @Given("el usuario está en la página de pago")
    public void usuarioEnPaginaDePago() {
        pagoPage = new tc_6Page();
        pagoPage.navigateToPagoPage();
    }

    @When("el usuario ingresa los detalles de una tarjeta válida")
    public void usuarioIngresaDetallesTarjetaValida() {
        pagoPage.enterCardDetails("4111111111111111", "12/23", "123");
    }

    @When("confirma el pago")
    public void usuarioConfirmaPago() {
        pagoPage.submitPago();
    }

    @Then("la orden debe ser confirmada y el pago debe ser aprobado")
    public void verificarPagoYConfirmacion() {
        Assert.assertTrue(pagoPage.isPagoSuccessful());
        Assert.assertTrue(pagoPage.isOrdenConfirmada());
    }
}