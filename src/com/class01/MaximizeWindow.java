package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/yoviq/IdeaProjects/Selenium/src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();//will maximize actual window
        //driver.manage().window().fullscreen();//will give you full screen of PAGE -no toolbox,no url





    }
}
