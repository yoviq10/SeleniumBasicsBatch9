package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandling {

    public static String url = "http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement daysDD= driver.findElement(By.id("select-demo")); //identified that specific dropdown that we will interact with
        Select select = new Select(daysDD); //creating an object of a select class

        select.selectByIndex(2);//prints out Monday,, will print by index;
        Thread.sleep(1000);

        select.selectByVisibleText("Wednesday"); //prints out Wednesday
        Thread.sleep(1000);

        select.selectByValue("Sunday"); //prints out Sunday

        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println(size);  //prints out 8

        for (int i= 0; i<size; i++){
           String optionText= allOptions.get(i).getText();
           select.selectByIndex(i);
            System.out.println(optionText); //prints all the days
            Thread.sleep(2000);
        }



    }
}
