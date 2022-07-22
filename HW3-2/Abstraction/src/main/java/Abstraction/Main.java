package Abstraction;


public class Main {
    public static void main(String[] args) {
        String[] argument = {"start-maximized"}; // Tam ekran olarak browser başlasın
        DriverType driverType = DriverType.CHROME; // Browser tipi chrome seçildi

        AbstractClass _homePage = new HomePageTest(driverType,argument);
        // Abstract, ortak olan methodları yazdığımız yer.
        // Eğer farklı methodlar varsa abstract void method olarak yazabiliriz.


        _homePage.open("https://enuygun.com"); // Enuygun.com'u açıyoruz
        _homePage.clickLoginBtn(); // Giriş Yap butonuna tıklıyoruz
        _homePage.loginPopupIsDisplayed(); // Giriş yap popup açıldı mı?
    }
}