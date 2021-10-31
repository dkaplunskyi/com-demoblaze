package forms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Form2 {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/forms/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.name("firstname"));
        WebElement lastname = driver.findElement(By.name("lastname"));
        WebElement gender = driver.findElement(By.cssSelector("[value=\"Female\"]"));
        WebElement exp = driver.findElement(By.cssSelector("[value=\"7\"]"));
        WebElement date = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=text]"));
        WebElement profession = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > span:nth-child(2) > input[type=checkbox]"));
        WebElement photo = driver.findElement(By.name("photo"));
        WebElement flavours = driver.findElement(By.cssSelector("[value=\"Selenium Webdriver\"]"));
        Select continents = new Select(driver.findElement(By.name("continents")));
        WebElement selenium_commands = driver.findElement(By.name("selenium_commands"));
        List<WebElement> children = selenium_commands.findElements(By.xpath("./child::*"));
        WebElement btn = driver.findElement(By.name("submit"));

        firstname.sendKeys("julia");
        lastname.sendKeys("Semenova");
        gender.click();
        exp.click();
        date.sendKeys("10/25/2021");
        profession.click();
        photo.sendKeys("/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/forms/photo.jpeg");
        flavours.click();
        continents.selectByIndex(1);
        for (WebElement i : children) {
            i.click();
        }


        Thread.sleep(4000);
        btn.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(4000);
        driver.quit();
    }
}
