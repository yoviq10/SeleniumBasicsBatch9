package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW3 {

    public static  String url="https://www.ebay.com";

    public static void main(String[] args) throws InterruptedException {

        /*
        HW2
        Go to ebay.com
        get all the categories and print them in the console
        select Computers/Tables & Networking
        click on search
        verify the header
        */


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement allCategoriesDD= driver.findElement(By.id("gh-cat"));
        Select select = new Select(allCategoriesDD);


        List<WebElement> options = select.getOptions();
        for (WebElement option:options){ //iterating through each web element
            String optionText= option.getText();
            System.out.println(optionText); //prints out all lists of dropdowns from amazon
        }

        select.selectByValue("58058");
        Thread.sleep(2000);
        select.selectByVisibleText("gh-btn");


    }
}
