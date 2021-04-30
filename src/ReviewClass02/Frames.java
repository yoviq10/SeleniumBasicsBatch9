package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://syntaxTechs.com/selenium-practice/bootstrap-iframe.php";
        driver.get(url); //navigating tot url

        //Switch to the iframe under consideration
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//a[@id ='btn_basic_example']")).click();
        //to interact with any other element on the home page we need to switch back
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[text()= 'Alerts & Modals']")).click();

        //switch using Web Element
        WebElement iframe = driver.findElement(By.xpath("//iframe[@name = 'FrameOne']"));

        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("//a[@id= 'btn_inter_example']")).click();

        driver.switchTo().defaultContent();



    }
}
