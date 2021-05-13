package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarHandling {

    public static String url = "https://www.delta.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        WebElement calendar = driver.findElement(By.id("input_departureDate_1"));
        calendar.click();

        WebElement departureMonth = driver.findElement(By.className("dl-datepicker-month-0"));
        String dMonthText=departureMonth.getText();   //getting text will verify what month you located

        WebElement nextButton= driver.findElement(By.xpath("//span[text() = 'Next']"));

        while(!dMonthText.equals("July")){   //..(if out departure month does not equal july, then we will click next! using while loop because we do not know when we should stop
           // System.out.println(dMonthText);
            nextButton.click();
            dMonthText=departureMonth.getText();
        }

        List<WebElement> departDates= driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-0'] /tr/td")); //started with tbody because table was not unique
        for (WebElement departDate: departDates) {
            if(departDate.getText().equals("17")){
                departDate.click();
                break;
            }
        }

       WebElement rMonth= driver.findElement(By.className("dl-datepicker-month-1"));
        String returnMonthText = rMonth.getText();

        while(!returnMonthText.equals("September")){
            nextButton.click();
            returnMonthText=rMonth.getText();
        }


        List<WebElement> returnDates= driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-1']/tr/td"));
        for (WebElement returnDate: returnDates) {
            if(returnDate.getText().equals("3")){
               returnDate.click();
                break;
            }
        }

        WebElement doneButton = driver.findElement(By.className("donebutton"));
        doneButton.click();
    }
}