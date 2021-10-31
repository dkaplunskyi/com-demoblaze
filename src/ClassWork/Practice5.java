package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {

    static final public String URl = "https://the-internet.herokuapp.com/dynamic_controls";
    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URl);

        WebElement remove_btn = driver.findElement(By.cssSelector("#checkbox-example > button"));
        remove_btn.click();

        Thread.sleep(4000);

        WebElement message = driver.findElement(By.cssSelector("#message"));
        String text = message.getText();
        if (text.isEmpty() ) {
            System.out.println("Failed");
        }else {
            System.out.println("Passed");
        }

        WebElement enable_btn = driver.findElement(By.cssSelector("#input-example > button"));
        enable_btn.click();
        Thread.sleep(4000);
        WebElement field = driver.findElement(By.cssSelector("#input-example > input[type=text]"));
        if (field.isEnabled()) {
            System.out.println("Passed");
            field.sendKeys("Hello Julia!");
        }else {
            System.out.println("Failed");
        }

        Thread.sleep(3000);
        driver.quit();

    }

}
