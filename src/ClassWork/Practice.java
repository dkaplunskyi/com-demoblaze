package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {

    static String chromeDriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";
    static final String URL = "https://the-internet.herokuapp.com/add_remove_elements/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement add_btn = driver.findElement(By.cssSelector("#content > div > button"));

        for (int i = 0; i < 5; i++) {
            add_btn.click();
        }

        Thread.sleep(2000);

        WebElement remove_btn = driver.findElement(By.cssSelector("#elements"));
        List<WebElement>  childs = remove_btn.findElements(By.xpath("./child::*"));

        for (WebElement i : childs) {
            i.click();
        }

        Thread.sleep(2000);
        driver.quit();

    }


}
