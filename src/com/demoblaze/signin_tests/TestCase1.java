package com.demoblaze.signin_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void createNewUser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement signup_link = driver.findElement(By.cssSelector("#signin2"));
        signup_link.click();
        Thread.sleep(1000);

        WebElement userName_field = driver.findElement(By.cssSelector("#sign-username"));
        WebElement password_field = driver.findElement(By.cssSelector("#sign-password"));
        WebElement signup_btn = driver.findElement(By.cssSelector("button[onclick='register()']"));

        userName_field.sendKeys("test74567test");
        password_field.sendKeys("pass74567pass");
        signup_btn.click();
        Thread.sleep(1000);

        String alert_message = driver.switchTo().alert().getText();

        if (alert_message.contains("Sign up successful")) {
            System.out.println("TC#1: Passed");
        }else{
            System.out.println("TC#1: Failed");
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
