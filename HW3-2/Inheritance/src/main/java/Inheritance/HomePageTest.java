package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class HomePageTest {
    WebDriver driver;

    public HomePageTest(DriverType driverType, String[] argument) {
        this.driver = Driver.get(driverType, argument);
    }

    public void open(String url) {
        this.driver.get(url);
    }

    public void clickLoginBtn() {
        this.driver.findElement(By.id("ctx-LoginBtn")).click();
    }

    public void clickSignUpBtn() {
        this.driver.findElement(By.id("ctx-RegisterBtn")).click();
    }

    public void loginPopupIsDisplayed() {
        try {
            boolean displayed = this.driver.findElement(By.cssSelector(".membership--form-wrapper--login")).isDisplayed();
            System.out.println(displayed ? "Test basarili." : "Test basarisiz.");
        } catch (Exception e) {
            System.out.println("Test basarisiz. \n\nHata: " + e.getMessage());
        }
    }
}
