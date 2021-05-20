package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LoginPageWithPageFactory extends CommonMethods {

    /*
    * We will be using annotations to find an element
    *
    * */

    @FindBy(id= "txtUsername")   //specifying locator and its value
    public WebElement userNameTextBox;

    @FindBy(xpath= "//input[@id = 'txtPassword']")
    public WebElement passwordTextBox;

    @FindBy(css= "input#btnLogin")
    public WebElement loginBtn;

    /*@FindBy(xpath= "//table[@id= 'resultTable']/tbody/tr")//storing a list of web elements
    public List<WebElement>tableRows;*/

    public LoginPageWithPageFactory(){  // creating constructor
    PageFactory.initElements(driver,this ); //initialization point ..driver will initialize all elements that are located in this specific class/pg



}

}
