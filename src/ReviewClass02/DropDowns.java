package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {

    public static String url ="https://www.surveymonkey.com/r/?sm=uQNn3rYKMcVS0Dyy6GTjSw%3D%3D";

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='211154525']"));

        Select select=new Select(dropdown);
        //by index
        select.selectByIndex(2);

        //select by value
        select.selectByValue("2657263886");

        //by visible text
        select.selectByVisibleText("Answer Choice A");

        //loop through all the options that are available

        List<WebElement> all_options=select.getOptions(); //returns a list of options from web page
        int size=all_options.size();
        System.out.println("The size of your list is: "+size);

        for (WebElement option:all_options) {
            System.out.println("The text of option is: "+option.getText());
        }
    }
}
