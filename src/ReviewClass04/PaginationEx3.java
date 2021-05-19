package ReviewClass04;

import static ReviewClass04.CommonMethods.FindElementByXpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationEx3 {

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static  void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        WebElement logIn =driver.findElement(By.id("btnLogin"));
        logIn.click();

        WebElement PIMbtn= FindElementByXpath(driver,"//a[@id= 'menu_pim_viewPimModule']");
        PIMbtn.click();
        //a[@id= 'menu_pim_viewPimModule']


}

}