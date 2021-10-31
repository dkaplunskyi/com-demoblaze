package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Hovers {

    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/homework/chromedriver";
    public static final String URL = "https://the-internet.herokuapp.com/hovers";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get(URL);
        driver.manage().window().maximize();

        WebElement parentElement = driver.findElement(By.cssSelector(".example"));
        List<WebElement> divs = parentElement.findElements(By.cssSelector(".figure"));

        for (WebElement i : divs) {
            action.moveToElement(i).build().perform();
            Thread.sleep(1000);
        }
        
        driver.quit();
    }

}
