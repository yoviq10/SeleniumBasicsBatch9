package ReviewClass04;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaginationExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        String url="http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";
        driver.get(url);

        List<WebElement> tableRows= driver.findElements(By.xpath("//table[@class = 'table table-hover']/tbody/tr"));
        int size= tableRows.size();
        System.out.println(size);

        WebElement nextbtn= driver.findElement(By.xpath("//a[@class= 'next_link']"));

        boolean flag=true;

        while(flag){
            for (WebElement tablerow: tableRows) {

                String rowText=tablerow.getText();
                if(rowText.contains("Juan valdez")){
                  flag=false;
                    System.out.println(rowText);
                    break;
                }

            }
           if(flag){
            nextbtn.click();
           }
        }



    }

}