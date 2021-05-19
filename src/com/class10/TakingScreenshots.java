package com.class10;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenshots {

    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester", Keys.TAB); //Keys.TAB will automatically navigate to the next field
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test", Keys.ENTER); //will allow you in the website without needing to click on the login BUTTON
        //not widely used because, you would need to find the path for the button


        TakesScreenshot ts=(TakesScreenshot)driver; //down casting
        File sourceFile= ts.getScreenshotAs(OutputType.FILE); // screenshot is taken and assigning it to a file object/variable

        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin.png") ); //creating a new file for destination and inserting that path into the named folder
        } catch (IOException e) {  //input output exception
            e.printStackTrace();
        }


    }
}