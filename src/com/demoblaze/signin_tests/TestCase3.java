package com.demoblaze.signin_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void signupWithExistingUser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement login_link = driver.findElement(By.cssSelector("#signin2"));
        Thread.sleep(500);
        login_link.click();
        Thread.sleep(500);
        WebElement userName = driver.findElement(By.cssSelector("#sign-username"));
        WebElement password = driver.findElement(By.cssSelector("#sign-password"));
        Thread.sleep(500);
        userName.sendKeys("dk");
        password.sendKeys("q1w2e3");

        WebElement login_btn = driver.findElement(By.cssSelector("button[onclick='register()']"));
        Thread.sleep(500);
        login_btn.click();
        Thread.sleep(500);

        String alertMessage = driver.switchTo().alert().getText();

        if (alertMessage.contains("This user already exist")) {
            System.out.println("TC#3: Passed");
        }else{
            System.out.println("TC#3: Failed");
        }

        Thread.sleep(1000);
        driver.quit();
    }

}
