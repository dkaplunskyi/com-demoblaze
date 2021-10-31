package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryUI {

    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/homework/chromedriver";
    public static final String URL = "https://the-internet.herokuapp.com/jqueryui/menu";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

        WebElement firstElement = driver.findElement(By.cssSelector("#ui-id-3 > a"));

        Actions actions = new Actions(driver);

        actions.moveToElement(firstElement).build().perform();
        Thread.sleep(1000);
        WebElement secondElement = driver.findElement(By.cssSelector("#ui-id-4 > a"));
        actions.moveToElement(secondElement).build().perform();
        Thread.sleep(1000);
        WebElement thirdElement = driver.findElement(By.cssSelector("#ui-id-5 > a"));
        thirdElement.click();


        Thread.sleep(1000);
        driver.quit();
    }

}
