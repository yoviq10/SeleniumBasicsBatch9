package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

   /* go to AA
    Select depart date
    select return date
    select destination
    click on search
    Quit the browser
    */

    public static String url = "https://www.aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        WebElement calendar = driver.findElement(By.id("aa-leavingOn"));
        calendar.click();

        WebElement departureMonth = driver.findElement(By.className("ui-datepicker-month"));
        String dMonthText = departureMonth.getText();   //getting text will verify what month you located

        WebElement nextButton = driver.findElement(By.xpath("//span[text() = 'Next']"));

    }

}