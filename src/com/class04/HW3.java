package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {

       /* HW 3
        HRMS Application Negative Login:
        Open chrome browser
        Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
        Enter valid username
        Leave password field empty
        Verify error message with text "Password cannot be empty" is displayed.*/

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userNameTextBox = driver.findElement(By.cssSelector("input#txtUsername "));
        userNameTextBox.sendKeys("Admin");

        WebElement passwordTextBox = driver.findElement(By.cssSelector("span[id*= 'spanMessage']"));
        boolean isPasswordTextBoxDisplayed= passwordTextBox.isDisplayed();
        System.out.println(isPasswordTextBoxDisplayed);




        if(!isPasswordTextBoxDisplayed){
            System.out.println("Password cannot be empty");
        }else{
            System.out.println("Password is displayed");
        }



    }
}
