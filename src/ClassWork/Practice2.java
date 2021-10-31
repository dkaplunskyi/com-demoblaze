package ClassWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

    static String chromeDriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";
    static final String URL = "https://the-internet.herokuapp.com/context_menu";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement hot_spot = driver.findElement(By.cssSelector("#hot-spot"));

        Actions actions = new Actions(driver);
        actions.contextClick(hot_spot).perform();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        driver.quit();
    }

}
