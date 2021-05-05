package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    /*HW
    Go to https://demoqa.com/browser-windows
    click on New Tab and print the text from new tab in the console
    click on New Window and print the text from new window in the console
    click on New Window Message and print the text from new window in the console
    Verify the title is displayed
    Print out the title of the all pages
    */

    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        String mainPageWindowHandle = driver.getWindowHandle();
        WebElement newTabButton= driver.findElement(By.id("tabButton"));
       newTabButton.click();
       WebElement samplePgText= driver.findElement(By.id("sampleHeading"));

        Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles);
        Iterator<String> it= allWindowHandles.iterator();
        mainPageWindowHandle= it.next();

        String childHandle=it.next();
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageWindowHandle);



    }

}