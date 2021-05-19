package ReviewClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static ReviewClass04.CommonMethods.FindElementByXpath;
import static ReviewClass04.CommonMethods.openBrowser;

public class AmericanAirlinesCalendar {

    public static String url = "https://www.aa.com/homePage.do";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait= new WebDriverWait(driver, 20);
        openBrowser(driver, url);

        WebElement calandar1=FindElementByXpath(driver, "//input[@id= 'aa-leavingOn']");
        calandar1.click();

        WebElement month= FindElementByXpath(driver,"//span[@class= 'ui-datepicker-month']");
        System.out.println(month.getText());

      //  WebElement nextbtn= FindElementByXpath(driver, "//a[@class= 'ui-datepicker-next ui-corner-all']");

        while(!month.getText().equals("July")){
           WebElement nextbtn= FindElementByXpath(driver, "//a[@title= 'Next']");
            nextbtn.click();

            month=FindElementByXpath(driver,"//span[@class= 'ui-datepicker-month']");
            System.out.println(month.getText());

        }

        List<WebElement> dates= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));

        for (WebElement date: dates) {
            System.out.println(date.getText());
        }
    }
}