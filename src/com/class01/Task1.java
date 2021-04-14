package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

/* 1.) launch the browser
2.)navigate to amazon web site
3.)print out the title and the url in the console
 */
        System.setProperty("webdriver.chrome.driver","C:/Users/yoviq/IdeaProjects/Selenium/src/driver/chromedriver.exe" );

        WebDriver driver = new ChromeDriver();

        driver.get("https:www.amazon.com"); //navigating to the specified URL

        String title= driver.getTitle();   //getting the title of page
        String url= driver.getCurrentUrl(); //getting current url
        System.out.println(url+" "+title);
        driver.quit();  //to end


    }

}