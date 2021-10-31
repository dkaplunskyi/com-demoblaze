package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

    static public String chromeDriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";
    static final public String URL = "https://the-internet.herokuapp.com/horizontal_slider";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement slideElement = driver.findElement(By.cssSelector("#content > div > div > input[type=range]"));
        Actions actions = new Actions(driver);

        actions.dragAndDropBy(slideElement, 55, 0).build().perform();
        Thread.sleep(500);
        String slider_value = slideElement.getAttribute("value");

        if (!slider_value.equals("0")) {
            System.out.println("value is: " + slider_value + " - Passed");
        }else{
            System.out.println("failed");
        }

        Thread.sleep(500);
        driver.quit();

    }

}
