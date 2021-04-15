package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
      // String chromeDriverPath= System.getProperty("user.dir") +"/src/driver/chromedriver.exe";  I would need both of line 9 & 10 to run it that way
      // System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("syntax"); //finding the element by locator and typing whatever you want
        driver.findElement(By.id("pass")).sendKeys("syntax123");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000); //Thread.sleep not used regular just for class purposes pauses
      //  driver.findElement(By.linkText("Forgot Password?"));
        driver.findElement(By.partialLinkText("forgot")).click();  //runs part of link
        driver.quit();



    }
}
