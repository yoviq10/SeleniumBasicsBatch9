package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {


    public static String url = "https://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        WebElement accountsAndLists= driver.findElement(By.id("nav-link-accountList"));
        Actions action=new Actions(driver);//because we will be performing actions with our driver
        action.moveToElement(accountsAndLists).perform(); //moving to this accountAndList Element, WE NEED TO USE PERFORM METHOD at the end

    }
}