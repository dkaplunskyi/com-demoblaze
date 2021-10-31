package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice7 {

    static final public String URl = "https://the-internet.herokuapp.com/download";
    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URl);
        driver.manage().window().maximize();

        WebElement parentElement = driver.findElement(By.cssSelector("#content > div"));
        List<WebElement> elementList = parentElement.findElements(By.tagName("a"));

        for (WebElement i : elementList) {
            System.out.println(i.getText());
            if (i.getText().equals("25_17 - Комната .mp3")){
                i.click();
                break;
            }
        }

        Thread.sleep(1000);
        driver.quit();

    }

}
