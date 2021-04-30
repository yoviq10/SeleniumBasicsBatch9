package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    static String url = "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {

            /*Task
            Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
            verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
            verify enroll today button is enabled
            */

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        driver.manage().window().maximize();

        WebElement verifyHeader = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li/a"));
        boolean isVerifyHeader = verifyHeader.isDisplayed();
        System.out.println("header status is " + isVerifyHeader);
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        WebElement frameElement = driver.findElement(By.name("FrameTwo"));
        driver.switchTo().frame(frameElement);
        Thread.sleep(2000);

        WebElement verifyEnabled = driver.findElement(By.xpath("//a[@class ='enroll-btn']"));
        boolean enabledV = verifyEnabled.isEnabled();
        if (enabledV) {
            System.out.println("Enroll button is enabled");
        } else {
            System.out.println("Enroll button is disabled");
        }

    }
}
