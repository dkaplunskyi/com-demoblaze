package forms;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Form3 {

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/forms/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.id("RESULT_TextField-1"));
        WebElement lastname = driver.findElement(By.id("RESULT_TextField-2"));
        WebElement phone = driver.findElement(By.id("RESULT_TextField-3"));
        WebElement country = driver.findElement(By.id("RESULT_TextField-4"));
        WebElement city = driver.findElement(By.id("RESULT_TextField-5"));
        WebElement email = driver.findElement(By.id("RESULT_TextField-6"));
        WebElement sunday  = driver.findElement(By.id("RESULT_CheckBox-8_0"));


        firstname.sendKeys("Dmytro");
        lastname.sendKeys("Kaplunskyi");
        phone.sendKeys("4134178");
        country.sendKeys("Ukraine");
        city.sendKeys("Kyiv");
        email.sendKeys("kaplunsky@gmail.com");
        sunday.click();


        Thread.sleep(2000);
        driver.quit();
    }

}
