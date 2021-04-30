package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDowns {

    public static String url ="https://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        WebElement MulDropdown = driver.findElement(By.xpath("//select[@name= 'States']"));

        Select select = new Select(MulDropdown);

        boolean isMultiple = select.isMultiple();
        System.out.println("Is the dropdown multiple? : "+isMultiple);

        //select california and Ohio
        select.selectByValue("California");

        select.deselectByVisibleText("Ohio");

        Thread.sleep(2000);
        select.deselectByVisibleText("Ohio");
        Thread.sleep(2000);
        select.deselectAll(); //will deselect all
    }
}
