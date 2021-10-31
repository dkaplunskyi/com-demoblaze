package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Practice4 {

    static final public String URl = "https://the-internet.herokuapp.com/drag_and_drop";
    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URl);

        WebElement fromElement = driver.findElement(By.cssSelector("#column-a"));
        WebElement toElement = driver.findElement(By.cssSelector("#column-b > header"));

        Actions action = new Actions(driver);
        action.dragAndDrop(fromElement, toElement).release().build().perform();


        Thread.sleep(3000);
        driver.quit();

    }

}
