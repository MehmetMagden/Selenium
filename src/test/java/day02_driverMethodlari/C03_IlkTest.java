package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {

    public static void main(String[] args) {

        /*
            1-https://www.amazon.com url'ine gidin
            2- başlıgın amazon kelimesini içerdigini test edin
            3- url'in https://www.amazon.com'e eşit olduğunu test edin
            4- sayfayı kapatın
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1-https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");

        //2- başlıgın amazon kelimesini içerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Title test PASSED");
        }else System.out.println("Title "+arananKelime+" icermiyor Title test FAILED");

        //System.out.println("driver.getTitle().contains(\"Amazon\") = " + driver.getTitle().contains("Amazon")); CALİSMADI

        //3- url'in https://www.amazon.com'e eşit olduğunu test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";

        if(actualTitle.equals(expectedUrl)){
            System.out.println("Url Test PASSED");
        }else System.out.println("url : "+actualUrl+" >  "+ expectedUrl+" den farkli test FAILED");

        //System.out.println("driver.getCurrentUrl().equals(\"https://www.amazon.com\") = " + driver.getCurrentUrl().equals("https://www.amazon.com"));

        //4- sayfayı kapatın
        driver.close();
    }
}
