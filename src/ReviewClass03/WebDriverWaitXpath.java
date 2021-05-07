package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");        WebDriver driver = new ChromeDriver(); // launch the browser
        String url = "http://the-internet.herokuapp.com/dynamic_loading/1";
        driver.get(url);
        driver.findElement(By.xpath("//button")).click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Hello')]")));
        WebElement textis = driver.findElement(By.xpath("//*[contains(text(),'Hello')]"));
        String text = textis.getText();
        System.out.println(text);
    }
}
