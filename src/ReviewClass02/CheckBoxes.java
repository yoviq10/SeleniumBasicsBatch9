package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static String url ="https://www.ironspider.ca/forms/checkradio.htm";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url); //navigating tot url
        WebElement redCheckbox = driver.findElement(By.xpath("//input[@type= 'checkbox'][@value='red']"));

        boolean redCheckboxisenabled= redCheckbox.isEnabled(); //prints out true, it is enabled
        System.out.println("The check box is Enables "+redCheckboxisenabled);
        boolean redCheckBoxisselected= redCheckbox.isSelected();
        System.out.println("The check box is selected: "+ redCheckBoxisselected);
        Thread.sleep(2000);

        redCheckbox.click();
        Thread.sleep(2000);
        redCheckBoxisselected=redCheckbox.isSelected();
        System.out.println("The check box is selected: "+ redCheckBoxisselected);

        List<WebElement> Checkboxes= driver.findElements(By.xpath("//input[@type= 'checkbox']"));
        System.out.println("Number of checkboxes: "+Checkboxes.size());

        //select yellow, orange, and purple

        for (WebElement checkBox:Checkboxes) {
            String CheckboxValue= checkBox.getAttribute("value");
            System.out.println(CheckboxValue);

            if(CheckboxValue.equalsIgnoreCase("yellow")){
                checkBox.click();
            }
            if(CheckboxValue.equalsIgnoreCase("purple")){
                checkBox.click();
            }

        }

    }
}
