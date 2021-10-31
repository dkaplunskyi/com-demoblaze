package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {

    static public String chromeDriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";
    static final public String URL = "https://the-internet.herokuapp.com/key_presses";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement input = driver.findElement(By.cssSelector("#target"));
        input.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);

        input.sendKeys(Keys.ARROW_UP);
        Thread.sleep(500);

        input.sendKeys(Keys.ARROW_LEFT);
        Thread.sleep(500);

        input.sendKeys(Keys.ARROW_RIGHT);

        Thread.sleep(500);
        driver.quit();

    }

}
