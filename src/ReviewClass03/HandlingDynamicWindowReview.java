package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HandlingDynamicWindowReview {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
        driver.get(url);
        //login code
        WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();
        //table code
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println(rows);
//        Iterator<WebElement> row = rows.iterator();
        for (int i=0 ;i<rows.size();i++){
            String  row=rows.get(i).getText();
            System.out.println(row);
        }
    }
}
