package test;

import Pages.LoginPage;
import testbase.BaseClass;

public class LoginTest {

    public static void main(String[] args) {

        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        LoginPage loginPage=new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();


        BaseClass.tearDown();   //calling the baseclass
    }
}
