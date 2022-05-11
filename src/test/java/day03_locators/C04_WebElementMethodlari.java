package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {

    /*
        amazon.com'a gidip arama kutusunu locate edin.
        2- Arama kutusunun tagName'inin input olduğunu test edin
        3- Arama kutusunun name attribute'nun değerinin ... olduğunu test edin
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        WebElement aramaCubugu = driver.findElement(By.id("twotabsearchtextbox"));
        if (aramaCubugu.getTagName().equals("input")) {
            System.out.println("passed");
        }else System.out.println("FAILED");


        driver.close();
    }

}
