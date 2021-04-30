package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static String url ="https://material-ui.com/components/radio-buttons/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        List<WebElement> radiobtns = driver.findElements(By.xpath("//input[@name= 'gender1']"));

        for (WebElement radiobtn: radiobtns) {
            String Value=radiobtn.getAttribute("Value");
                if(Value.equalsIgnoreCase("female")){
                    radiobtn.click();
                }
                if(!radiobtn.isEnabled()){
                    System.out.println("There is a disabled radio button");
                }
            }



    }
}
