package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandlingDDWithIterator {

    public static  String url=" http://amazon.com";

    public static void main(String[] args) {

        //using Iterator WAY

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);
        boolean isMultiple = select.isMultiple();

        if (!isMultiple){   //if it is not multiple select, then print categories from amazon
            List<WebElement> options = select.getOptions();
            Iterator<WebElement> it = options.iterator();
            while (it.hasNext()){
                WebElement ddOption = it.next();
                String optionText = ddOption.getText();
                System.out.println(optionText);
            }
        }


    }
}
