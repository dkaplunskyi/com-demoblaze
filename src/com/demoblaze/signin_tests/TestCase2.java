package com.demoblaze.signin_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void signupWithEmpty() throws InterruptedException {
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
        userName.sendKeys("");
        password.sendKeys("");

        WebElement login_btn = driver.findElement(By.cssSelector("button[onclick='logIn()']"));
        Thread.sleep(500);
        login_btn.click();
        Thread.sleep(500);

        String alertMessage = driver.switchTo().alert().getText();

        if (alertMessage.contains("Please fill out Username and Password")) {
            System.out.println("TC#2: Passed");
        }else{
            System.out.println("TC#2: Failed");
        }

        Thread.sleep(1000);
        driver.quit();
    }

}
