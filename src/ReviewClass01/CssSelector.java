package ReviewClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver(); //launch the browser
        String url="https://syntaxtechs.com/selenium-practice/basic-first-form-demo.php";
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys("yovanna");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        WebElement text= driver.findElement(By.cssSelector("span#display"));
        String name;
        name=text.getText();
        if(name.equalsIgnoreCase("yovanna")){
            System.out.println("you are successful");
        }else{
            System.out.println("you will win, don't worry");
        }

        driver.findElement(By.cssSelector("input[id$='m1']")).sendKeys("100");

        driver.findElement(By.cssSelector("input[id$='m2']")).sendKeys("500");

        driver.findElement(By.cssSelector("button[onclick^='return']")).click();

        WebElement value= driver.findElement(By.cssSelector("span[id*='value']"));
        if(value.getText().equalsIgnoreCase("600")){
            System.out.println("you are successful");
        }else{
            System.out.println("You will win, don't worry");
        }

    }
}
