package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_2Page {
    WebDriver driver;

    private By logoutButton = By.id("logoutButton");

    public tc_2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        WebElement button = driver.findElement(logoutButton);
        button.click();
    }
}