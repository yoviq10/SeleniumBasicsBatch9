package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import testbase.BaseClass;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends BaseClass {
 //inheriting baseclass

    /*public void clickOnWebElement(){

    }*/






    /*
    * this method will clear a text box and send text
    * @param element
    * @param text
    */
    public static void sendText(WebElement element, String text){//2 different parameters, one is the one you want to interact and the other is the one you want to pass
        element.clear(); //clearing any text
        element.sendKeys(text);//sending text from parameter
    }

}