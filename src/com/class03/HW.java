package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {

//        HW
//        Navigate to http://syntaxtechs.com/selenium-practice/index.php
//        Click on start practicing
//        click on simple form demo
//        enter any text on first text box
//        click on show message
//        quit the browser

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver(); //creating an instance of the WebDriver
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.manage().window().maximize();
        WebElement startPracticing = driver.findElement(By.xpath("//a[text()= ' Start Practising ']"));
        startPracticing.click();
        Thread.sleep(2000);
        WebElement simpleFormdemo = driver.findElement(By.xpath("//a[@contains(text()= 'Simple Form Demo'] )/preceding-sibling::a"));
        simpleFormdemo.click();


    }
}
