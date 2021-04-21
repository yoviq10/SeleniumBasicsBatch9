package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        /*HW :navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Yovanna");
        driver.findElement(By.id("customer.lastName")).sendKeys("Quisbert");
        driver.findElement(By.id("customer.address.street")).sendKeys("6083 MadeUp Court");
        driver.findElement(By.id("customer.address.city")).sendKeys("Daikokufuto");
        driver.findElement(By.id("customer.address.state")).sendKeys("JP");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22041");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("703-111-2222");
        driver.findElement(By.id("customer.ssn")).sendKeys("000-22-3333");
        driver.findElement(By.name("customer.username")).sendKeys("yoyo");
        driver.findElement(By.name("customer.password")).sendKeys("12345");
        driver.findElement(By.name("repeatedPassword")).sendKeys("12345");
        driver.findElement(By.className("button")).click();
        //Thread.sleep(1000);
        driver.close();
    }

}