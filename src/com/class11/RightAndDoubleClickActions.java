package com.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions {

    public static String url = "http://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        WebElement rightClickButton = driver.findElement(By.xpath("//span[text() = 'right click me']"));
        Actions action= new Actions(driver); // we can reuse this object on line 31
        action.contextClick(rightClickButton).perform();

        WebElement editOption= driver.findElement(By.xpath("//span[text() = 'Edit']"));
       // editOption.click();
        action.click(editOption).perform(); //another way to click if other option doesn't work

        Alert alert=driver.switchTo().alert(); //an instance
        alert.accept();  //accepting alert

        WebElement doubleClickButton= driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
        action.doubleClick(doubleClickButton).perform(); //performing that action
        System.out.println(alert.getText()); //getting text of alert
        alert.accept(); //clicking ok on alert button


    }

}