package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticTable {

    public static String url = "http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
       List<WebElement> rowData= driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
        System.out.println(rowData.size()); //there are 7 rows inside container

        Iterator<WebElement> it=rowData.iterator(); //iterating through the web element
        while (it.hasNext()){
            WebElement row= it.next();  //go through each row..a new row
            String rowText= row.getText();
            System.out.println(rowText);
        }

        System.out.println("-------------------");

        List<WebElement> colsData=driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(colsData.size());
        for (WebElement coldata: colsData) {
            String colText=coldata.getText();
            System.out.println(colText);
        }








    }

}