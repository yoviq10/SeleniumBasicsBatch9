package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class HandlingCalendars {

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement leaveButton= driver.findElement(By.linkText("Leave"));
        leaveButton.click();


        WebElement fromCalendar= driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        WebElement mDD= driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD=new Select(mDD);
        monthDD.selectByVisibleText("Jul"); //3 characters of July because it only shows 3 in pg

        List<WebElement> fromDates= driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(fromDates.size());

        for (WebElement fromDate: fromDates) {
            if(fromDate.getText().equals("29")){
                fromDate.click();
                break; //breaking loop
            }
        }
    }

}