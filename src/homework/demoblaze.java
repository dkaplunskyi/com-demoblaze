package homework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demoblaze {

    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/homework/chromedriver";
    public static final String URL = "https://www.demoblaze.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();





        Thread.sleep(1000);
        driver.quit();
    }

}
