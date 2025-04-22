import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_7Page {
    WebDriver driver;

    private By notificationsToggle = By.id("notifications_toggle");
    private By settingsPageIndicator = By.id("settings_page_indicator");

    public tc_7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSettings() {
        // Lógica para navegar a la pantalla de configuraciones
        driver.findElement(settingsPageIndicator).click();
    }

    public void activateNotifications() {
        // Lógica para activar las notificaciones
        driver.findElement(notificationsToggle).click();
    }

    public boolean areNotificationsEnabled() {
        // Verificar si las notificaciones están activadas
        return driver.findElement(notificationsToggle).isSelected();
    }
}