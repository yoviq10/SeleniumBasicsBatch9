package com.class10;

import com.sun.deploy.cache.Cache;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TakingScreenshots {

    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
    private static Cache FileUtils;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester", Keys.TAB); //Keys.TAB will automatically navigate to the next field
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test", Keys.ENTER); //will allow you in the website without needing to click on the login BUTTON
        //not widely used because, you would need to find the path for the button


      /*  TakingScreenshots ts=(TakingScreenshots) driver;
        File sourceFile= ts.getScreenshotAs(outputType.FILE); //the screenshot is taken

        FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin.png"));
*/
    }
}