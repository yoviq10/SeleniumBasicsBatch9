package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url

        WebElement fileUploadLink= driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click(); //clicking on upload link

        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\yoviq\\OneDrive\\Desktop\\SampleTestData.png");

        WebElement uploadButton= driver.findElement(By.id("file-submit"));
        uploadButton.click();

    }

}