package ReviewClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver(); //launch the browser
        String url="https://www.bbc.com";
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id= 'idcta-link']")).click(); //by id
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()= 'Register now']")).click(); //by text
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href,'age?')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'day')]")).sendKeys("20"); //or ---->//input[contains(@id,'day')]
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'month')]")).sendKeys("02"); //or---->//input[contains(@id,'month')]
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'year')]")).sendKeys("1994");// or  ---->input[contains(@id,'year')]
        Thread.sleep(2000);
    }
}
