package forms;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form4 {

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/forms/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        WebElement gender = driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label"));
        WebElement userNumber = driver.findElement(By.id("userNumber"));
//        WebElement date = driver.findElement(By.id("dateOfBirthInput"));
        WebElement hobbies = driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label"));
        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));


        firstName.sendKeys("Dmytro");
        lastName.sendKeys("Kaplunskyi");
        userEmail.sendKeys("kaplunskyi@gmail.com");
        gender.click();
        userNumber.sendKeys("4314445656");
//        date.sendKeys("16 Sep 1987");
        hobbies.click();
        uploadPicture.sendKeys("/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/forms/photo.jpeg");
        currentAddress.sendKeys("31 Main St.");


        Thread.sleep(3000);
        driver.quit();
    }

}
