package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators{
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.
        WebElement sightIn = driver.findElement(By.id("sign-in"));

        //   b. Sign in butonuna basin
        sightIn.click();

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..

        WebElement emailBox= driver.findElement(By.id("session_email"));
        WebElement passwordBox= driver.findElement(By.id("session_password"));
        WebElement submitBox= driver.findElement(By.name("commit"));
        /*
             d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
         */
        emailBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");
        submitBox.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement actualKullaniciAdiElementi=driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi.getText());
        String expectedUserMail="testtechproed@gmail.com";
        if(expectedUserMail.equals(actualKullaniciAdiElementi.getText())){
            System.out.println("Expected Kullanıcı testi PASSED");
        }  else {
            System.out.println("Expected kullanıcı testi FAILED");
        }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesElementi= driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi= driver.findElement(By.linkText("Sign out"));
        if (adressesElementi.isDisplayed()) {
            System.out.println("adresses Testi PASSED");
        }else {
            System.out.println("adresses Testi FAILED");
        }
        if (signOutElementi.isDisplayed()) {
            System.out.println("signOutElementi Testi PASSED");
        }else {
            System.out.println("signOutElementi Testi FAILED");
        }

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerListesi = " + linklerListesi.size());

        //Linkleri yazdıralım
        //Listemiz webElement'lerden oluştuğu için direk yazdıramayız. Direk yazdırırsak referansları yazdıracaktır.
        //ForEachLoop kullanılmalı ve getText() ile yazdırılmalı

        for(WebElement w: linklerListesi){
            System.out.println(w.getText());
        }

        driver.close();


    }



    /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun.
     */





}
