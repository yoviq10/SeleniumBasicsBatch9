package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {

        /*TC 1: Facebook dropdown verification
            Open chrome browser
            Go to "https://www.facebook.com"
            click on create new account
            Verify:
            month dd has 12 month options
            day dd has 31 day options
            year dd has 115 year options
            Select your date of birth
            Quit browser
           */
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("New")).click();
        Thread.sleep(1000);

        System.out.println("Verifying # of months");
        WebElement monthsDD= driver.findElement(By.id("month"));
        Select select = new Select(monthsDD);

        List<WebElement> allMonths = select.getOptions();
        int size = allMonths.size();
        System.out.println(size);  //prints out 12

      /*  for (int i= 0; i<size; i++){
            String optionText= allMonths.get(i).getText();
            select.selectByIndex(i);
            System.out.println(optionText); //prints all the months
            Thread.sleep(2000);
        }*/

        System.out.println("verifying # of days");
        WebElement daysDD= driver.findElement(By.id("day"));
        Select select1=new Select(daysDD);

        List<WebElement> allDays =select1.getOptions();
        int size1=allDays.size();
        System.out.println(size1);

        System.out.println("verifying # of years");
        WebElement yearsDD= driver.findElement(By.id("year"));
        Select select2=new Select(yearsDD);

        List<WebElement> allYearsDD= select2.getOptions();
        int size2=allYearsDD.size();
        System.out.println(size2);

        select.selectByVisibleText("Feb");
        Thread.sleep(1000);

        select1.selectByValue("4");

        select2.selectByValue("1992");

        driver.quit();



    }

}
