package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver","C:/Users/yoviq/IdeaProjects/Selenium/src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://facebook.com"); //this will come first, will wait
        driver.navigate().to("https://google.com"); //then navigate to this after
        Thread.sleep(1000); //pauses the thread for the given milliseconds (little breaks)
        driver.navigate().back(); //goes to facebook,then google and back to facebook
        Thread.sleep(1000); //pauses the thread for the given milliseconds
        driver.navigate().forward();//goes fb, google, fb, and back to google
        Thread.sleep(1000); //pauses the thread for the given milliseconds
        driver.navigate().refresh(); //refreshes the page
       // driver.quit(); //Will Quits the WHOLE browser completely
        driver.close();// Will close the current TAB
    }
}
