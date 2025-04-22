package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_9Page {
    private WebDriver driver;
    private By protectedPageLink = By.id("protectedPage");
    private By accessDeniedMessage = By.id("accessDeniedMessage");

    public tc_9Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToProtectedPage() {
        driver.findElement(protectedPageLink).click();
    }

    public boolean isAccessDenied() {
        return driver.getCurrentUrl().contains("accessDenied");
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(accessDeniedMessage).isDisplayed();
    }
}