package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    /*  JAVA DOC info about the below method..what it does:
     *
     * This method will navigate to a website by the given URL
     * @param url
     */

    public static void setUpWithSpecificUrl(String url) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        driver=new ChromeDriver(); //launching the web
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    /*
     * This method will quit and open browser
     */

    public static void tearDown() {
        if (driver != null) {  //1st condition: when driver is not null
            driver.quit();
        }
    }
}

