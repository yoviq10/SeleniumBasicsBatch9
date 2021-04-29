package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

    public static String url = "http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); //will open up browser for us
        driver.get(url);
        List<WebElement> optionCheckBoxes = driver.findElements(By.xpath("//input[@class = 'cb1-element']"));
        System.out.println(optionCheckBoxes.size());

        for (WebElement optionCheckBox: optionCheckBoxes) {
           String checkBox = optionCheckBox.getAttribute("value");//need to specify the attribute in "", will return you its vale

            if(checkBox.equalsIgnoreCase("Option-2")){ //if you use getText, it has to be what you see on the page
              Thread.sleep(1000);
                optionCheckBox.click();
                break;   //breaking the loop, we don't need to iterate it again
            }
        }

       /* for (WebElement optionCheckBox: optionCheckBoxes) {
            optionCheckBox.click();
            Thread.sleep(2000);
        }*/

    }
}
