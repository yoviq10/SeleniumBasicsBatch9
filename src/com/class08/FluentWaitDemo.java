package com.class08;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {
 //Fluent wait is a global wait
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)  //Wait interacts with the sessions
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5)) //checking how frequent your application is running/performing and its execution
                .ignoring(NoSuchElementException.class); //closing statement with semi colon...will ignore nosuchelement exception

    }
}
