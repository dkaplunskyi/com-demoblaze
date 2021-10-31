package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class homework_10_26 {

    static public String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/homework/chromedriver";
    public static final String URL = "https://testsheepnz.github.io/BasicCalculator.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        ChromeDriver driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

        WebElement firstNum = driver.findElement(By.cssSelector("#number1Field"));
        WebElement secondNum = driver.findElement(By.cssSelector("#number2Field"));
        WebElement calculateButton = driver.findElement(By.cssSelector("#calculateButton"));

        firstNum.sendKeys("10");
        secondNum.sendKeys("2");

        WebElement parent = driver.findElement(By.cssSelector("#selectOperationDropdown"));
        List<WebElement> childs = parent.findElements(By.tagName("option"));

        for (WebElement i : childs) {
            i.click();
            Thread.sleep(1000);
            calculateButton.click();
            WebElement field = driver.findElement(By.cssSelector("#numberAnswerField"));
            System.out.println(field.getAttribute("value"));
            Thread.sleep(2000);
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
