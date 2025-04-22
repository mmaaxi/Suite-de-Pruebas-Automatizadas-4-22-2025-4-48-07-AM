import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_4Page {

    WebDriver driver;

    By searchBox = By.name("q");
    By searchResults = By.id("result-stats");

    public tc_4Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterSearchTerm(String searchTerm) {
        WebElement searchInputElement = driver.findElement(searchBox);
        searchInputElement.sendKeys(searchTerm);
        searchInputElement.submit();
    }

    public void verifySearchResults() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResults));
        // Aquí se podría agregar una verificación más sofisticada sobre los resultados
        WebElement resultsElement = driver.findElement(searchResults);
        assert resultsElement.isDisplayed();
    }
}