package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice8 {

    static final public String URl = "https://the-internet.herokuapp.com/upload";
    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URl);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement choose_btn = driver.findElement(By.cssSelector("#file-upload"));
        choose_btn.sendKeys("/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/photo.jpeg");
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.cssSelector("#file-submit"));
        submit.click();

        Thread.sleep(2000);
        driver.quit();


    }

}
