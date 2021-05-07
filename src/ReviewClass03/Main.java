package ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        String url = "https://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";
        driver.get(url);

        List<WebElement> row = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(row.size());
        for(WebElement x: row){
            System.out.println(x.getText());
        }
        List<WebElement> headerRow = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        for(WebElement x: headerRow){
            System.out.println(x.getText());
        }
    }
}
