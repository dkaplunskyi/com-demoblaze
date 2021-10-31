package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {

    static final public String URl = "https://the-internet.herokuapp.com/dynamic_loading";
    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URl);
        driver.manage().window().maximize();

        WebElement link_1 = driver.findElement(By.cssSelector("#content > div > a:nth-child(5)"));
        Thread.sleep(2000);
        link_1.click();
        WebElement start_btn = driver.findElement(By.cssSelector("#start > button"));
        start_btn.click();
        Thread.sleep(8000);
        WebElement message_link_1 = driver.findElement(By.cssSelector("#finish > h4"));
        String text = message_link_1.getText();

        if (text.isEmpty()) {
            System.out.println("Failed");
        }else{
            System.out.println("Passed");
        }
        driver.navigate().back();
        Thread.sleep(2000);

        WebElement link_2 = driver.findElement(By.cssSelector("#content > div > a:nth-child(8)"));
        link_2.click();
        Thread.sleep(2000);
        WebElement start_btn2 = driver.findElement(By.cssSelector("#start > button"));
        start_btn2.click();
        Thread.sleep(5000);

        WebElement message_link_2 = driver.findElement(By.cssSelector("#finish > h4"));
        String text2 = message_link_2.getText();
        if (text2.isEmpty()) {
            System.out.println("Failed");
        }else{
            System.out.println("Passed");
        }
        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.quit();

    }

}
