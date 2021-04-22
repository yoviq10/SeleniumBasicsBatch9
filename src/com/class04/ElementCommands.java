package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButton = driver.findElement(By.cssSelector("input[value ='0 - 5']" ));
        boolean isAgeRadioBtnEnabled =ageRadioButton.isEnabled(); //is Enabled ( we can go ahead and click on it , will return a boolean value, so we assign it to a boolean variable
        System.out.println(isAgeRadioBtnEnabled);//Prints out True

        //checking weather or not it is disabled with the !
        if(!isAgeRadioBtnEnabled){
            System.out.println("not enabled");
        }else{
            System.out.println("it is enabled");
        }


        boolean isAgedRadioBtnDisplayed= ageRadioButton.isDisplayed(); //will return a boolean value, so we assign it to a boolean variable
        System.out.println(isAgedRadioBtnDisplayed); //prints out true

        boolean isAgeRadioBtnSelected= ageRadioButton.isSelected(); //getting a boolean value in return
        System.out.println("Before clicking "+ isAgeRadioBtnSelected); //will print out false
        ageRadioButton.click();

        isAgeRadioBtnSelected=ageRadioButton.isSelected(); //we need to check it 1 more time, need to re-assign variable "isAgeRadioBtnSelected"
        System.out.println("After clicking "+ isAgeRadioBtnSelected);// will print out True

        driver.quit();



    }
}
