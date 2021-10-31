package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void loginWindowDisplayTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement login_link = driver.findElement(By.cssSelector("#login2"));
        login_link.click();
        Thread.sleep(1000);
        WebElement login_window = driver.findElement(By.cssSelector(".modal-content #logInModalLabel"));

        if (!login_window.isDisplayed()) {
            System.out.println("TC#3: Failed");
        } else {
            System.out.println("TC#3: Passed");
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
