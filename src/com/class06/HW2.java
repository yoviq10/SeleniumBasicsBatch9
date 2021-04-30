package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    static String url ="http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {

        /*HW
        Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
        click on each button and handle the alert accordingly
        */

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        driver.manage().window().maximize();

        WebElement alertBox = driver.findElement(By.xpath("//button[@onclick= 'myAlertFunction()']"));
        alertBox.click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

        WebElement confirmBox = driver.findElement(By.xpath("//button[@onclick ='myConfirmFunction()']"));
        confirmBox.click();
        Thread.sleep(2000);
        Alert box = driver.switchTo().alert();
        box.dismiss();

        WebElement promptBox = driver.findElement(By.xpath("//button[@onclick= 'myPromptFunction()']"));
        promptBox.click();
        Thread.sleep(2000);
        Alert pBox = driver.switchTo().alert();
        pBox.sendKeys("learn java");
        Thread.sleep(2000);
        pBox.accept();

    }
}
