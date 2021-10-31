package ClassWork;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    static final public String URl = "https://the-internet.herokuapp.com/frames";
    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/ClassWork/chromedriver";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URl);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement nested_link = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > a"));
        Thread.sleep(500);
        nested_link.click();
        Thread.sleep(2000);
        // get a parent/top frame
        WebElement parent_iframe = driver.findElement(By.cssSelector("html > frameset > frame:nth-child(1)"));
        // switch to parent/top frame
        driver.switchTo().frame(parent_iframe);
        // get a middle frame
        WebElement middle_frame = driver.findElement(By.cssSelector("html > frameset > frame:nth-child(2)"));
        // switch to middle frame
        driver.switchTo().frame(middle_frame);
        // get a name of middle frame
        WebElement middle_frame_name = driver.findElement(By.cssSelector("#content"));
        // checking of correct middle frame name
        if (middle_frame_name.getText().equals("MIDDLE")) {
            System.out.println(middle_frame_name.getText() + " " + "Passed");
        }else {
            System.out.println(middle_frame_name.getText() + " " + "Failed");
        }
        // switch back to parent frame
        driver.switchTo().parentFrame();
        // get a left frame
        WebElement left_frame = driver.findElement(By.cssSelector("html > frameset > frame:nth-child(1)"));
        // switch to left frame
        driver.switchTo().frame(left_frame);
        // get a name of left frame
        WebElement left_frame_name = driver.findElement(By.cssSelector("body"));
        // checking of correct left frame name
        if (left_frame_name.getText().equals("LEFT")) {
            System.out.println(left_frame_name.getText() + " " + "Passed");
        }else {
            System.out.println(left_frame_name.getText() + " " + "Failed");
        }
        // switch back to parent frame
        driver.switchTo().parentFrame();
        // get a right frame
        WebElement right_frame = driver.findElement(By.cssSelector("html > frameset > frame:nth-child(3)"));
        // switch to left frame
        driver.switchTo().frame(right_frame);
        // get a name of left frame
        WebElement right_frame_name = driver.findElement(By.cssSelector("body"));
        // checking of correct left frame name
        if (right_frame_name.getText().equals("RIGHT")) {
            System.out.println(right_frame_name.getText() + " " + "Passed");
        }else {
            System.out.println(right_frame_name.getText() + " " + "Failed");
        }
        // bottom
        driver.switchTo().parentFrame().switchTo().parentFrame();
        WebElement bottom_frame = driver.findElement(By.cssSelector("html > frameset > frame:nth-child(2)"));
        driver.switchTo().frame(bottom_frame);
        WebElement bottom_frame_name = driver.findElement(By.cssSelector("body"));
        System.out.println(bottom_frame_name.getText());






        Thread.sleep(1000);
        driver.quit();


    }

}
