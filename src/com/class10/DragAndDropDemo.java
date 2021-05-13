package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        driver.switchTo().frame(0); //switching to the frame by its index
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action= new Actions(driver); //created an object
       // action.dragAndDrop(draggable,droppable).perform();//will accept 2 different arguments

        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();//building all 3 elements to one and performing as 1
    }
}