package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {

    public static String url ="http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new ChromeDriver(); //opening 2 different chromes in 1 session
        driver.get(url); //navigating tot url
       String mainPageHandle= driver.getWindowHandle(); //getting current window handle---window handle of the first page..will return us a String
        System.out.println(mainPageHandle);//a unique ID inside your browser & we will need this to switch the tab, whole ID is already stored in the string
        WebElement helpLink= driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles= driver.getWindowHandles(); //Will automatically return LinkedHashSet
        System.out.println(allWindowHandles.size());//prints out a new CDwindow and size= 2 windows

        Iterator<String> it= allWindowHandles.iterator(); //Sting because handles are unique
       mainPageHandle= it.next(); //Stepping FORWARD & getting main pg, re-assigning 1 Handle Manually ..the next step is my main page handle..everytime it iterates will start from main pg

        String childHandle=it.next();//stepped FORWARD AGAIN & getting child page CD window, not switching anywhere!!
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle); //inserting unique handle & switching back to main pg/parent window
        driver.close();//will not close child window, because your focus is on the main pg
        //driver.quit();  //will quit all tabs and exit browser
        //driver1.quit(); //will close other chrome browser

    }
}
