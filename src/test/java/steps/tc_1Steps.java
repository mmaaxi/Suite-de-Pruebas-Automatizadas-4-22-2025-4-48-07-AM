package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_1Page;

import static org.junit.Assert.assertTrue;

public class tc_1Steps {

    WebDriver driver;
    tc_1Page loginPage;

    @Given("El usuario navega a la página de login")
    public void elUsuarioNavegaALaPaginaDeLogin() {
        driver = new ChromeDriver();
        loginPage = new tc_1Page(driver);
        driver.get("https://www.ejemplo.com/login");
    }

    @When("El usuario ingresa el nombre de usuario {string}")
    public void elUsuarioIngresaElNombreDeUsuario(String username) {
        loginPage.enterUsername(username);
    }

    @And("El usuario ingresa la contraseña {string}")
    public void elUsuarioIngresaLaContraseña(String password) {
        loginPage.enterPassword(password);
    }

    @And("El usuario hace clic en el botón de login")
    public void elUsuarioHaceClickEnElBotonDeLogin() {
        loginPage.clickLoginButton();
    }

    @Then("El usuario debe obtener acceso exitoso al sistema")
    public void elUsuarioDebeObtenerAccesoExitosoAlSistema() {
        assertTrue(loginPage.isLoginSuccessful());
        driver.quit();
    }
}