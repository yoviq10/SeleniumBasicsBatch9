package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(id= "welcome")
    public WebElement welcomeAdmin;

    public DashboardPage(){ //creating constructor
        PageFactory.initElements(driver, this);
    }

}
