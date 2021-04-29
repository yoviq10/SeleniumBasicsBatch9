package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleDropdowns {


    public static String url = "http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement statesDD = driver.findElement(By.id("multi-select"));

        Select select = new Select(statesDD);
        boolean isMultiple=  select.isMultiple(); //will return boolean value
        System.out.println(isMultiple); //will print out TRUE

        if(isMultiple){
           List<WebElement> options= select.getOptions();
            for (WebElement option:options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText); //selects all options f
                Thread.sleep(1000);
            }
        }

       select.deselectByIndex(5); //deselecting Texas...by index starting from 0

       // select.deselectAll(); //deselects all options



    }
}
