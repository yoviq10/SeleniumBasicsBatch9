package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {

    public static String url ="http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        String mainPageWindowHandle= driver.getWindowHandle();
        WebElement instagramButton= driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton= driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instaAndFacebookButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));
        instagramButton.click();
        facebookButton.click();
        instaAndFacebookButton.click();

        Set<String> allWindowHandles= driver.getWindowHandles();//iterating 4 time through the same handles
        System.out.println(allWindowHandles.size());
        Iterator<String> it= allWindowHandles.iterator();
        while (it.hasNext()){ //start iterating through handles
            String handle= it.next(); //get the next handle
            if(!handle.equals(mainPageWindowHandle)) {  //Set a condition >>>& iterating 3 times because 1 false & closing all child windows/tabs except main/parent page
                driver.switchTo().window(handle);//Switch to a w which os not equal to a parent handle
                System.out.println(driver.getTitle()); //printing the title
                driver.close();
            }
        }
        driver.switchTo().window(mainPageWindowHandle); //switching back to parent/main pg
        instagramButton.click();
    }
}
