package ReviewClass02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static String url ="https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

       /* SwitchTo()
        it simply switches to that particular alert and allows us to perform
         operations in it.   */


        //simple alert
        driver.findElement(By.xpath(" //input[@value='Alert']")).click();// will open up alert
        Thread.sleep(2000);
        Alert simplealert=driver.switchTo().alert();
        simplealert.accept();

        //confirmation box
        driver.findElement(By.xpath(" //input[@value='Confirmation Box']")).click();
        Thread.sleep(2000);
        Alert confirmationalert=driver.switchTo().alert(); //switching to that alert
        String alertText=confirmationalert.getText();
        System.out.println("the text of the alert is :"+ alertText);
        Thread.sleep(2000);
        confirmationalert.dismiss();

        //prompt alerts

        driver.findElement(By.xpath(" //input[@value='Prompt']")).click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        Thread.sleep(2000);
        promptAlert.sendKeys("klenfkmsgksmgklsm");
        Thread.sleep(2000);
        promptAlert.accept();



    }
}
