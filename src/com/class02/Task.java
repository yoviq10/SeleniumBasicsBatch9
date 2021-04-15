package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Task
Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
Login
Get title and verify
logout
close the browser
 */
public class Task {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver(); //instance of webDriver
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");//will launch browser for us
        driver.manage().window().maximize();  //maximizing window
        WebElement username =driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password =driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");

        WebElement loginButton =driver.findElement(By.className("button"));
        loginButton.click();

                    //NOT PREFERRED WAY 31,32,33
        //driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester"); //finding the element by locator and typing in Username
       //driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test"); //finding the element by locator and setting a PWD
      // driver.findElement(By.className("button")).click();

        String title= driver.getTitle();
        if(title.equalsIgnoreCase("web orders")){
            System.out.println("Title is Correct");
        }else{
            System.out.println("Title is WRONG");
        }
        Thread.sleep(2000); //slight pause to se whats going on visually
      driver.findElement(By.linkText("Logout")).click();
     //   driver.quit();




    }
}
