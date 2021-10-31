package forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Form1 {

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/forms/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastname = driver.findElement(By.name("lastname"));
        WebElement gender_female  = driver.findElement(By.id("sex-1"));
        WebElement exp = driver.findElement(By.id("exp-6"));
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        WebElement professions = driver.findElement(By.cssSelector("#post-body-3077692503353518311 > div:nth-child(1) > div > div:nth-child(21)"));
        List<WebElement> children = professions.findElements(By.xpath("./child::input"));
        WebElement tools = driver.findElement(By.cssSelector("#post-body-3077692503353518311 > div:nth-child(1) > div > div:nth-child(23)"));
        List<WebElement> children2 = tools.findElements(By.xpath("./child::input"));
        Select continents = new Select(driver.findElement(By.id("continents")));
        WebElement selenium_commands = driver.findElement(By.id("selenium_commands"));
        List<WebElement> children3 = selenium_commands.findElements(By.xpath("./child::*"));
        WebElement photo = driver.findElement(By.id("photo"));
        WebElement submit = driver.findElement(By.id("submit"));

        firstName.sendKeys("Olga");
        lastname.sendKeys("Larina");
        gender_female.click();
        exp.click();
        datepicker.sendKeys("10/25/2021");
        System.out.println(professions);
        System.out.println(children);
        for (WebElement i: children) {
            i.click();
        }
        for (WebElement i: children2) {
            i.click();
        }
        continents.selectByVisibleText("Europe");
        for (WebElement i: children3) {
            i.click();
        }
        photo.sendKeys("/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/forms/photo.jpeg");
        Thread.sleep(8000);
        submit.click();
        driver.quit();

    }
}
