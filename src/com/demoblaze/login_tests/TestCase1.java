package com.demoblaze.login_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void verifyPageLoaded() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        String title = driver.getTitle();
        System.out.println(title);
        if (title.isEmpty()) {
            System.out.println("TC#1: Failed");
        } else {
            System.out.println("TC#1: Passed");
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
