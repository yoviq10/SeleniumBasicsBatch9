package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
       */

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("New")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Yovanna");
        driver.findElement(By.name("lastname")).sendKeys("Quisbert");
        driver.findElement(By.name("reg_email__")).sendKeys("JohnDoe@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("JohnDoe@yahoo.com"); //confirming email
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
        driver.findElement(By.name("websubmit")).click();  //clicking on sign up button
      //  driver.findElement(By.id("u_2f_9_9T")).click(); //attempting to close popup from X(top right corner) by id
        driver.close();
      //driver.quit();









    }
}
