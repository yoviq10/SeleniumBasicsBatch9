package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {

   /*     TC 1: Amazon link count:
        Open chrome browser
        Go to "https://www.amazon.com/"
        Get all links
        Get number of links that has text
        Print to console only the links that has text
                try using while loops, iterators, ect..*/

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");

        List<WebElement> allLinks= driver.findElements(By.tagName("a"));// stored all elements by tag name "a" in a container
        System.out.println("Number of Links "+ allLinks.size()); //prints out number of links >>all under a tag (it changes)

        for (WebElement link: allLinks) {  //Iterating through each and every link web element
            String fullLink = link.getAttribute("href"); //getting attributes of "href" & will retrieve its value
            String linkText = link.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText+"         "+ fullLink);  //getting link text of each Link
            }
        }






    }
}
