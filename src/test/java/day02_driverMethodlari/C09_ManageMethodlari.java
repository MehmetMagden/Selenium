package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amaazon.com");
        /*
            ilerde wait konusunu daha geniş olarak ele alacağız.
            Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre bir yüklenme
            süresine ihtiyaç vardır.
            veya bir web elementinin kullanabilmesi için zaman ihtiyaç olabilir
            implicitly bize sayfanin yüklenmesini ve sayfadakielementlere ulaşım için beklenecek
            maximum süreyi belirlemeye olanağı tanır
         */
        driver.close();
    }
}
