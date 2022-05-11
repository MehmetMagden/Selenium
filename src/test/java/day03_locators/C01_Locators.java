package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazona gidip nutella aratalım



        driver.get("https://www.amazon.com");
        /*
            findElement(By...locator) --> istediğimiz we elementini bize döndürür. Bizde o webelementini kullanmak için
            bir obje'ye assign ederiz.
         */
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //WebElement aramaKutusu =driver.findElement(By.className("nav-search-field "));

        /*
            Herhangi bir WebElement'ine istediğimiz yazıyı göndermek istersek
         */
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        /*
            <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
            class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
         */

       // driver.close();


    }
}
