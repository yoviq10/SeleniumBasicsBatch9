package ReviewClass03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launch the browser
        String url = "https://smartbear.com/blog/how-to-handle-multiple-tabs-in-selenium-webdriver/";
        driver.get(url);
        String homepagehandle = driver.getWindowHandle();//get the home page handler
        System.out.println(homepagehandle);
        Thread.sleep(5000);
        WebElement link1= driver.findElement(By.linkText("Selenium 101: Automating User Actions"));//click on the link
        link1.click();

        Thread.sleep(4000);
        Set<String> allhandles = driver.getWindowHandles();//get all handles
        Iterator<String> it = allhandles.iterator();
        homepagehandle=it.next();
        String link1handle = it.next();
        System.out.println(homepagehandle);
        System.out.println(link1handle);
        driver.switchTo().window(link1handle);//switch to link1 handle

        WebElement link2= driver.findElement(By.xpath("//a[@class='footer-external']"));//click on another link
        link2.click();
        allhandles= driver.getWindowHandles();//get the handle of the new link
        Iterator<String> itr = allhandles.iterator();
        int nth = 2;
        String value = null;
        for(int i = 0; itr.hasNext(); i++) {
            value = itr.next();
            if (i == nth) {
                System.out.println("new window handler "+value);
                break;
            }
        }

        Thread.sleep(3000);
        driver.switchTo().window(link1handle);
        Thread.sleep(3000);
        driver.switchTo().window(homepagehandle);


    }

}