package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase9 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void loginValid() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement login_link = driver.findElement(By.cssSelector("#login2"));
        Thread.sleep(500);
        login_link.click();
        Thread.sleep(500);
        WebElement userName = driver.findElement(By.cssSelector("#loginusername"));
        WebElement password = driver.findElement(By.cssSelector("#loginpassword"));
        Thread.sleep(500);
        userName.sendKeys("dk");
        password.sendKeys("q1w2e3");

        WebElement login_btn = driver.findElement(By.cssSelector("button[onclick='logIn()']"));
        Thread.sleep(500);
        login_btn.click();

        Thread.sleep(500);
        WebElement nameOfUser = driver.findElement(By.cssSelector("#nameofuser"));
        Thread.sleep(500);
        System.out.println(nameOfUser.getText());

        if (nameOfUser.getText().contains("Welcome")) {
            System.out.println("TC#9: Passed");
        }else{
            System.out.println("TC#9: Failed");
        }

        Thread.sleep(1000);
        driver.quit();
    }

}
