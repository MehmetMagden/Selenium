package day04_xpath_csslLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ {
    public static void main(String[] args) {


        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
       // driver.findElement(By.xpath("//button[@onclick='addElement()']")).click(); //onclick="addElement()
        //driver.findElement(By.xpath("//button[text()='Add Element']")).click(); //onclick="addElement()
        driver.findElement(By.xpath("//*[text()='Add Element']")).click(); //onclick="addElement()



        //3- Delete butonu’nun gorunur oldugunu test edin
        if (driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).isDisplayed()) {
            System.out.println("Delete Button göründü");
        }else System.out.println("Delete button görünmüyor");
        //4- Delete tusuna basin
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        if (driver.findElement(By.xpath("//h3")).isDisplayed()) {
            System.out.println("görünüyor");
        }else System.out.println("görünmüyor");
        driver.close();


    }
}
