import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_4Page;

public class tc_4Steps {

    WebDriver driver;
    tc_4Page searchPage;

    @Given("el usuario está en la página de búsqueda")
    public void el_usuario_está_en_la_página_de_búsqueda() {
        System.setProperty("webdriver.chrome.driver", "ruta/al/chromedriver");
        driver = new ChromeDriver();
        searchPage = new tc_4Page(driver);
        driver.get("url_de_la_página_de_búsqueda");
    }

    @When("el usuario ingresa el término de búsqueda {string}")
    public void el_usuario_ingresa_el_término_de_búsqueda(String searchTerm) {
        searchPage.enterSearchTerm(searchTerm);
    }

    @Then("los resultados relevantes se despliegan")
    public void los_resultados_relevantes_se_despliegan() {
        searchPage.verifySearchResults();
        driver.quit();
    }
}