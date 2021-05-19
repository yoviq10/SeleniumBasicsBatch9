package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo3 {


    public static String url = "https://google.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open();"); //opening a new tab

        WebElement search= driver.findElement(By.name("q"));
        search.sendKeys("Hello"); //will print on main page



    }
}