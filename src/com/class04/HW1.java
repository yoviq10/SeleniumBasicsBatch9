package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        /*  Task
        Open chrome browser
        Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify Syntax Logo is displayed.
        try using if and for loops like in class*/

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userNameTextBox = driver.findElement(By.cssSelector("input#txtUsername "));
        userNameTextBox.sendKeys("Admin");
        WebElement passwordTextBox = driver.findElement(By.cssSelector("input[id^= 'txtPassword']"));
        passwordTextBox.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.cssSelector("input[id*= 'btnLogin']"));
        loginButton.click();

        WebElement syntaxLogo = driver.findElement(By.cssSelector("img[src= '/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']" ));
        boolean isSyntaxLogoDisplayed= syntaxLogo.isDisplayed(); //will return a boolean value, so we assign it to a boolean variable
        System.out.println(isSyntaxLogoDisplayed); //prints out true

        //checking weather or not it is displayed with the !
        if(!isSyntaxLogoDisplayed){
            System.out.println("not displayed");
        }else{
            System.out.println("it is displayed");
        }




    }
}
