package day02_driverMethodlari;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(15,15));

        driver.close();


    }
}
