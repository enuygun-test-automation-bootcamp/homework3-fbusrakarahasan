package HW_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageTest implements EnuygunInterface {//Enuygun interfacesinden miras alınır
        WebDriver driver;

        @Override
        public WebDriver getDriver() {
            String[] argument = {"start-maximized"}; // Tam ekran olarak browser başlasın
            DriverType driverType = DriverType.CHROME; // Browser tipi chrome seçildi
            driver = Driver.get(driverType, argument);
            return driver;
        }

        @Override
        public void open(String url) {
            getDriver().get(url);
        }

        @Override
        public void clickLoginBtn() {
            getDriver().findElement(By.id("ctx-LoginBtn")).click();
        }

        @Override
        public void clickSignUpBtn() {
            this.getDriver().findElement(By.id("ctx-RegisterBtn")).click();
        }

        @Override
        public void loginPopupIsDisplayed() {
            try {
                boolean displayed = getDriver().findElement(By.cssSelector(".membership--form-wrapper--login")).isDisplayed();
                System.out.println(displayed ? "Test basarili." : "Test basarisiz.");
            } catch (Exception e) {
                System.out.println("Test basarisiz. \n\nHata: " + e.getMessage());
            }
            Driver.closeDriver();
        }
    }