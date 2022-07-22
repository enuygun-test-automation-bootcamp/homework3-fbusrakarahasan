package Abstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageTest extends AbstractClass {
    WebDriver driver;

    public HomePageTest(DriverType driverType, String[] argument) {
        this.driver = Driver.get(driverType, argument);
    }

    @Override
    public void open(String url) {
        this.driver.get(url);
    }

    @Override
    public void clickLoginBtn() {
        this.driver.findElement(By.id("ctx-LoginBtn")).click();
    }

    @Override
    public void clickSignUpBtn() {
        this.driver.findElement(By.id("ctx-RegisterBtn")).click();
    }

    @Override
    public void loginPopupIsDisplayed() {
        try {
            boolean displayed = this.driver.findElement(By.cssSelector(".membership--form-wrapper--login")).isDisplayed();
            System.out.println(displayed ? "Test basarili." : "Test basarisiz.");
        } catch (Exception e) {
            System.out.println("Test basarisiz. \n\nHata: " + e.getMessage());
        }
        Driver.closeDriver();
    }
}
