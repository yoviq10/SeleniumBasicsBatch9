package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo2 {

    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating to url
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");//script to scroll down on amazon pg pixels

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-500)"); //always starts at 0

        WebElement backToTop= driver.findElement(By.xpath("//span[contains(text(), 'Back to top')]"));
        js.executeScript("arguments[0].scrollIntoView(true)",backToTop);


    }

}