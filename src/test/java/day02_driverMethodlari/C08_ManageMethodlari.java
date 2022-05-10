package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_ManageMethodlari {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //maximize iken boyutlar
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        //maximize iken boyutlar
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        Thread.sleep(2000);


        driver.close();
    }
}
