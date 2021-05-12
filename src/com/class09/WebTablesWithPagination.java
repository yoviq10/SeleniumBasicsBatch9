package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesWithPagination {


    public static String url = "http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        List<WebElement> tablesRows= driver.findElements(By.xpath("//table[@class = 'table table-hover'] /tbody/tr"));
        WebElement nextButton= driver.findElement(By.xpath("//a[@class = 'next_link']"));

        boolean flag=true;

        while (flag){   //while my flag is true, I am going inside my for loop
            for (WebElement tableRow: tablesRows) { //getting all rows in for loop
                String rowText=tableRow.getText();//looping in each row
                if(rowText.contains("Archy J")){
                    flag=false; //breaking the while loop by setting it false
                    System.out.println(rowText);  //printing and printing again
                    break;  //breaking for loop ..inside for loop to break it
                }

            }

            nextButton.click(); //this will try to click on next button again, when there isn't one on the pg

        }

            driver.quit();

    }

}