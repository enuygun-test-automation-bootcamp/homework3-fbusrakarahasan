package HW_Interface;

public class Main {
    public static void main(String[] args) {
        HomePageTest _interfaceKullanim = new HomePageTest();

        _interfaceKullanim.open("https://enuygun.com"); // Enuygun.com'u açıyoruz
        _interfaceKullanim.clickLoginBtn(); // Giriş Yap butonuna tıklıyoruz
        _interfaceKullanim.loginPopupIsDisplayed(); // Giriş yap popup açıldı mı?
    }
}



