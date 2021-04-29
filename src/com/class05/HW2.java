package com.class05;

import com.sun.javafx.image.ByteToBytePixelConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {

                /*HW1
                Go to facebook sign up page
                Fill out the whole form
                Click signup
                */
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("New")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Testing");
        driver.findElement(By.name("lastname")).sendKeys("Page");
        driver.findElement(By.name("reg_email__")).sendKeys("JohnDoe@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("JohnDoe@yahoo.com"); //confirming email
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345");

        WebElement birthMonthDD= driver.findElement(By.id("month"));
        Select select = new Select(birthMonthDD);
        select.selectByVisibleText("Feb");
        Thread.sleep(1000);
        WebElement birthDayDD= driver.findElement(By.id("day"));
        Select select1=new Select(birthDayDD);
        select1.selectByValue("4");
        WebElement birthYearDD= driver.findElement(By.id("year"));
        Select select2=new Select(birthYearDD);
        select2.selectByValue("1992");

        WebElement gender= driver.findElement(By.name("sex"));
        gender.click();

        driver.findElement(By.name("websubmit")).click();  //clicking on sign up button







    }
}
