package Inheritance;

class InheritanceEnuygun extends HomePageTest {
    public InheritanceEnuygun(DriverType driverType, String[] argument) {
        super(driverType, argument);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] argument = {"start-maximized"}; // Tam ekran olarak browser başlasın
        DriverType driverType = DriverType.CHROME; // Browser tipi chrome seçildi

        InheritanceEnuygun _enuygun = new InheritanceEnuygun(driverType, argument); // Bir üst sınıf olan HomePageTest sınıfından InheritanceEnuygun sınıfına kalıtım yapmış olduk
        _enuygun.open("https://enuygun.com"); // Enuygun.com'u açıyoruz
        _enuygun.clickLoginBtn(); // Giriş Yap butonuna tıklıyoruz
        _enuygun.loginPopupIsDisplayed(); // Giriş yap popup açıldı mı?
    }
}