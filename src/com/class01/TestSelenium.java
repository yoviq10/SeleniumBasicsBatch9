package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/yoviq/IdeaProjects/Selenium/src/driver/chromedriver.exe" );

        WebDriver driver = new ChromeDriver();

        driver.get("https:www.amazon.com");





    }
}
