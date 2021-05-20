package test;

import Pages.DashboardPage;
import Pages.LoginPageWithPageFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import testbase.BaseClass;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {
    public static void main(String[] args) {

        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory loginPageWithPageFactory=new LoginPageWithPageFactory();

        DashboardPage dashboardPage=new DashboardPage();

        loginPageWithPageFactory.userNameTextBox.sendKeys("Admin");
        loginPageWithPageFactory.passwordTextBox.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginBtn.click();

        TakesScreenshot ts=(TakesScreenshot)BaseClass.driver; //accessed driver variable
        File sourceFile=ts.getScreenshotAs(OutputType.FILE); //getting a file in return
        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    String welcomeText=dashboardPage.welcomeAdmin.getText();
        System.out.println(welcomeText);

        BaseClass.tearDown(); //terminates browser
    }
}
