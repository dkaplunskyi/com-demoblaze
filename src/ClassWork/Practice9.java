package ClassWork;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice9 {

    static final public String URl = "https://the-internet.herokuapp.com/floating_menu";
    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URl);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1350)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -1350)", "");

        Thread.sleep(1000);
        driver.quit();


    }

}
