package com.class08;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
   /* HW
    go to https://the-internet.herokuapp.com/dynamic_controls
    click on checkbox and click on remove
    verify the text
    click on enable verify the textbox is enabled
    enter text and click disable
    verify the textbox is disabled*/

    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
       /* WebElement checkBox = driver.findElement(By.id("ctl00_MainContent_username"));
        checkBox.click();
       */


    }

}