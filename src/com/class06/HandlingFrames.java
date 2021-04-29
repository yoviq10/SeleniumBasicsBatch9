package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

    public static String url =" http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        driver.manage().window().maximize();
        driver.switchTo().frame(0);//frame by frame int index, need to specify
       WebElement textBox= driver.findElement(By.id("name"));
       textBox.sendKeys("Covid sucks");

       driver.switchTo().defaultContent(); //main page is default content, we are switching back
     /*  WebElement alertButton = driver.findElement(By.id("alert"));
       alertButton.click();
       */
       driver.switchTo().frame("iframe_a"); //by frame String name
        textBox.clear(); //cleared previous "covid sucks"
        textBox.sendKeys("Selenium rocks"); //& replaced with "Selenium "rocks"

        driver.switchTo().defaultContent(); //switching back and forth main page and iframe

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']")); //created a variable "frameElement"
        driver.switchTo().frame(frameElement); //switching frame by using variable
        textBox.clear();
        textBox.sendKeys("Syntax techs");



    }
}
