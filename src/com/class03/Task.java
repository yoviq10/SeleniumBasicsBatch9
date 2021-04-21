package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver(); //creating an instance of the WebDriver
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        WebElement usernameTextBox =driver.findElement(By.xpath("//input[contains(@id, 'username')]"));  //creating a variable to use in the future
        usernameTextBox.sendKeys("Tester");
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@type = 'password']"));  //creating a variable to use in the future
        passwordTextBox.sendKeys("test");
        WebElement loginButton =driver.findElement(By.xpath("//input[@value ='Login']"));
        loginButton.click();
        Thread.sleep(2000); //pause so task will pass
        WebElement logoutLink = driver.findElement(By.xpath("//a[text() = 'Logout']"));
        logoutLink.click();

        driver.quit();


//        username: Admin
//        password: Hum@nhrm123
//        http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login



    }
}
