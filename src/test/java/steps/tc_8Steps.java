package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_8Page;
import static org.junit.Assert.assertTrue;

public class tc_8Steps {
    WebDriver driver;
    tc_8Page perfilPage;

    public tc_8Steps() {
        this.driver = Hooks.driver;
        perfilPage = PageFactory.initElements(driver, tc_8Page.class);
    }

    @Given("que el usuario está en la página de perfil")
    public void que_el_usuario_está_en_la_página_de_perfil() {
        perfilPage.navegarAPaginaDePerfil();
    }

    @When("el usuario edita los datos de perfil")
    public void el_usuario_edita_los_datos_de_perfil() {
        perfilPage.editarDatosDePerfil("NuevoNombre", "NuevoApellido");
    }

    @Then("el perfil debe ser actualizado con éxito")
    public void el_perfil_debe_ser_actualizado_con_éxito() {
        assertTrue(perfilPage.esPerfilActualizadoConExito());
    }
}