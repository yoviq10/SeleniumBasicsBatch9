package com.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    HW 2
    navigate to http://www.uitestpractice.com/Students/Contact
    click on the link
    get text
    print out in the console
     */
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        String mainPageWindowHandle = driver.getWindowHandle();



    }

}