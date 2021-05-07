package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = "https://www.facebook.com/";
        driver.get(url);
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("hello");
    }
}
