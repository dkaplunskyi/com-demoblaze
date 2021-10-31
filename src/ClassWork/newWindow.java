package ClassWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindow {

    static final public String URl = "https://the-internet.herokuapp.com/windows";
    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URl);
        String main_window = driver.getWindowHandle();
        WebElement link = driver.findElement(By.cssSelector("#content > div > a"));
        link.click();
        Thread.sleep(2000);
        driver.switchTo().window(main_window);

        Thread.sleep(2000);
        driver.quit();


    }

}
