import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_7Page;

public class tc_7Steps {
    tc_7Page page = new tc_7Page();

    @Given("el usuario está en la pantalla de configuraciones")
    public void elUsuarioEstaEnLaPantallaDeConfiguraciones() {
        page.navigateToSettings();
    }

    @When("el usuario activa las notificaciones")
    public void elUsuarioActivaLasNotificaciones() {
        page.activateNotifications();
    }

    @Then("las notificaciones están activadas en la aplicación")
    public void lasNotificacionesEstanActivadasEnLaAplicacion() {
        Assert.assertTrue(page.areNotificationsEnabled());
    }
}