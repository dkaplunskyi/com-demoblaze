package homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/homework/chromedriver";
    public static final String URL = "https://the-internet.herokuapp.com/javascript_alerts";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement alert_btn = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
        alert_btn.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        WebElement confirm_btn = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button"));
        confirm_btn.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        WebElement prompt_btn = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button"));
        prompt_btn.click();
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("Hello Cyram!");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.quit();
    }

}
