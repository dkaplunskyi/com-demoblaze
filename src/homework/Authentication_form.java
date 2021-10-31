package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_form {

    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/homework/chromedriver";
    public static final String URL = "https://the-internet.herokuapp.com/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement login_btn = driver.findElement(By.cssSelector("#login > button"));

        userName.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        Thread.sleep(2000);
        login_btn.click();
        Thread.sleep(1000);
        WebElement message = driver.findElement(By.cssSelector("#flash-messages"));
        if (message.isDisplayed()) {
            System.out.println("Login successfully");
        }else{
            System.out.println("error");
        }

        Thread.sleep(1000);
        driver.quit();
    }

}
