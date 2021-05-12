package com.class08;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW1 {
   /* HW
    go to https://the-internet.herokuapp.com/dynamic_controls
    click on checkbox and click on remove
    verify the text
    click on enable verify the textbox is enabled
    enter text and click disable
    verify the textbox is disabled*/

    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.id("checkbox"));
        checkBox.click();
        WebElement remove = driver.findElement(By.xpath("//button[contains(text(), 'Remove')]"));
        remove.click();

        WebDriverWait waitOne = new WebDriverWait(driver, 20);
        waitOne.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(message.getText());

        WebElement Enable = driver.findElement(By.xpath("//button[contains(text(), 'Enable')]"));
        Enable.click();

        WebDriverWait waitTwo = new WebDriverWait(driver, 20);
        waitTwo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement enable = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(enable.getText());

        WebElement textBox = driver.findElement(By.xpath("//input[@type ='text']"));
        textBox.sendKeys("hi");

        WebElement Disable =driver.findElement(By.xpath("//button[contains(text(), 'Disable')]"));
        Disable.click();

        WebDriverWait waitThree = new WebDriverWait(driver, 30);
        waitThree.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement disabled = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(disabled.getText());

        driver.quit();
    }
}

