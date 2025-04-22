package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_8Page {
    WebDriver driver;

    public tc_8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDePerfil() {
        driver.get("https://example.com/perfil");
    }

    public void editarDatosDePerfil(String nuevoNombre, String nuevoApellido) {
        driver.findElement(By.id("nombre")).clear();
        driver.findElement(By.id("nombre")).sendKeys(nuevoNombre);
        driver.findElement(By.id("apellido")).clear();
        driver.findElement(By.id("apellido")).sendKeys(nuevoApellido);
        driver.findElement(By.id("guardar")).click();
    }

    public boolean esPerfilActualizadoConExito() {
        return driver.findElement(By.id("mensajeExito")).isDisplayed();
    }
}