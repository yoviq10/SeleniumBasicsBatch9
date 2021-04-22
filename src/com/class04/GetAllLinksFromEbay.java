package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.ebay.com");
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));// stored all elements by tag name "a" in a container
        System.out.println("Number of Links "+ allLinks.size()); //prints out number of links >>all under a tag (it fluctuates/changes)

        for (WebElement link: allLinks) {  //Iterating through each and every link web element
            String fullLink = link.getAttribute("href"); //getting attributes of "href" & will retrieve its value
            String linkText = link.getText();
            if(!linkText.isEmpty()){
                System.out.println(linkText+"         "+ fullLink);  //getting link text of each Link
            }
        }
    }
}
