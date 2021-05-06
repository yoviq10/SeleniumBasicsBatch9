package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTask {

    public static String url = "http://syntaxtechs.com/selenium-practice/dynamic-elements-loading.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement startButton= driver.findElement(By.id("startButton"));
        startButton.click();

       /* //cSS selector way
        WebElement StartButton1= driver.findElement(By.cssSelector("button#startButton"));
        StartButton1.click();*/

        WebDriverWait wait=new WebDriverWait(driver,20); //maximum wait 20 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome')]"))); // * tag name is your wild card, can be used to replace h4 tag
                                                                         //("h4[contains(text(), 'Welcome')]")

        WebElement firstName= driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
        System.out.println(firstName.getText());

        driver.quit();


    }
}
