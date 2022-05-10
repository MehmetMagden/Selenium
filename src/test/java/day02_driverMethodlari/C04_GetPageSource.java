package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_GetPageSource {
    public static void main(String[] args) {

        /*
            amazon sitesine gidip Kaynak kodlarında "new Date" yazdığını test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        driver.getPageSource();          //ctrl + u

       String sayfaKaynakKodlari= driver.getPageSource();
       String arananKelime ="new Date";
       if (sayfaKaynakKodlari.contains(arananKelime)){
           System.out.println("Kaynak Kodu Testi PASSED");
       }else System.out.println("Kaynak kodlarında "+arananKelime+" yok Test FAILED");
       driver.close();
    }


}
