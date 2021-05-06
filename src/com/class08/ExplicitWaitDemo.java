package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

    public static String url = "http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement getNewUserButton= driver.findElement(By.id("save"));
        getNewUserButton.click();

        WebDriverWait wait=new WebDriverWait(driver,20); //Constructor of the web driver wait class  & waiting for 2 conditions inside parenthesis  creating an object of WebDriverwait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'First Name : ')]"))); // waiting until some condition


        WebElement firstName= driver.findElement(By.xpath("//p[contains(text(), 'First Name : ')]"));
        System.out.println(firstName.getText());


    }

}