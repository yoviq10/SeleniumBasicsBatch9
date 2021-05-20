package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {  //inheriting CommonMethods package because it has all base class, common methods, and now pg class

    /*multiLevel Inheritance
    * These pages will only have the object of the corresponding pg
    *
    * only has 3 elements in which we will perform the actions in the Test package
    */

    public WebElement userNameField= driver.findElement(By.id("txtUsername")); //storing object
    public WebElement passwordField=driver.findElement(By.id("txtPassword"));
    public WebElement loginButton=driver.findElement(By.id("btnLogin"));

}
