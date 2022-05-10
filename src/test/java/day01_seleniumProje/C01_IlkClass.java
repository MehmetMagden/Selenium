package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /*
            En ilkel haliyle bir otomasyon yapmak için Cllass'ımıza otomasyon için geerekli olaann webdriver'ın yerini
            göststeermemiz gerekir. bunun için java kütüphanesinden System.setProperty() methodunu kullanırız
            method 2 parameter istemektedir.
            ilki kullanacağımız driver :webdriver.chrome.driver
            ikincisi iste bu driverin fiziki yolu:
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.get("https://facebook.com");
        //driver.close();
    }
}
