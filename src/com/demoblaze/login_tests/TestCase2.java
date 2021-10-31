package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void headerLinkDisplay() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement navbar = driver.findElement(By.cssSelector(".navbar-nav>li"));

        if (navbar.isDisplayed()) {
            System.out.println("TC#2: Passed");
        } else {
            System.out.println("TC#2: Failed");
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
