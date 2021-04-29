package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropdownHandling {


    public static String url = "http://amazon.com";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement categoriesDD= driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);

        List<WebElement> options = select.getOptions();
        for (WebElement option:options){ //iterating through each web element
            String optionText= option.getText();
            System.out.println(optionText); //prints out all lists of dropdowns from amazon
        }

        select.selectByValue("search-alias=alexa-skills"); //we are selecting by value of attribute.NOT TEXT





    }
}
