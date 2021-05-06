package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    /*HW
    Go to https://demoqa.com/browser-windows
    click on New Tab and print the text from new tab in the console
    click on New Window and print the text from new window in the console
    click on New Window Message and print the text from new window in the console
    Verify the title is displayed
    Print out the title of the all pages
    */

    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        String mainPage = driver.getWindowHandle();
        System.out.println(mainPage);
        WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
        WebElement NewWindowMessage = driver.findElement(By.id("messageWindowButton"));
        newTab.click();
        newWindow.click();
        NewWindowMessage.click();
        Set<String> textTabs = driver.getWindowHandles();
        System.out.println(textTabs.size());
        Iterator<String> iterate = textTabs.iterator();
        System.out.println(textTabs);
        while (iterate.hasNext()) {
            String x = iterate.next();
            if (!x.equals(mainPage)) {
                driver.switchTo().window(x);
                System.out.println(driver.getTitle());
            }
        }
        driver.switchTo().window(mainPage);
        WebElement titleDispaly = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        titleDispaly.isDisplayed();
        System.out.println(titleDispaly);
    }
}



