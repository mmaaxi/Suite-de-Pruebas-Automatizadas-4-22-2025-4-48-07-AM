package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import pages.tc_5Page;

public class tc_5Steps {

    WebDriver driver;
    tc_5Page page;

    @Given("el usuario está en la página de listado de productos")
    public void el_usuario_está_en_la_página_de_listado_de_productos() {
        driver = new ChromeDriver();
        page = new tc_5Page(driver);
        driver.get("http://example.com/product-listing");
    }

    @When("el usuario selecciona un producto")
    public void el_usuario_selecciona_un_producto() {
        page.selectProduct();
    }

    @When("el usuario añade el producto al carrito")
    public void el_usuario_añade_el_producto_al_carrito() {
        page.addToCart();
    }

    @Then("el producto es añadido al carrito con éxito")
    public void el_producto_es_añadido_al_carrito_con_éxito() {
        assertTrue(page.isProductAddedToCart());
        driver.quit();
    }
}