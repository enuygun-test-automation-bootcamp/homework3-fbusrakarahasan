package HW_Interface;

import org.openqa.selenium.WebDriver;

interface EnuygunInterface {

    WebDriver getDriver();

    void open(String url);

    void clickLoginBtn();

    void clickSignUpBtn();

    void loginPopupIsDisplayed();
}