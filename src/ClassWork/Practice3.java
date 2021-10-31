package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

    static public String chromeDriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";
    static final public String URL = "https://the-internet.herokuapp.com/disappearing_elements";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement about = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > a"));
        about.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.quit();

    }

}
