package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void signinWindowDisplayTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement login_link = driver.findElement(By.cssSelector("#signin2"));
        login_link.click();
        Thread.sleep(1000);
        WebElement signin_window = driver.findElement(By.cssSelector(".modal-content #signInModalLabel"));

        if (!signin_window.isDisplayed()) {
            System.out.println("TC#5: Failed");
        } else {
            System.out.println("TC#5: Passed");
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
