package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    public static String url =" http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        driver.manage().window().maximize();
        WebElement simpleAlertButton= driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);

        Alert simpleAlert = driver.switchTo().alert(); //switching focus to popup alert
        simpleAlert.accept();// accepted the alert

        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);

        Alert confirmAlert = driver.switchTo().alert();//switching focus to alert
        String alertText = confirmAlert.getText(); //getting text from alert
        System.out.println(alertText); //printing the text from alert
        confirmAlert.dismiss(); //confirming the alert

        WebElement promptAlertButton = driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Syntax techs");
        promptAlert.accept();


    }
}
