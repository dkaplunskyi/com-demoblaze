package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void siginInWindowDisplayDisappearTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);
        Thread.sleep(1000);

        WebElement modalWindow = driver.findElement(By.cssSelector("body #signInModal"));
        System.out.println(modalWindow.getCssValue("display"));

        Thread.sleep(1000);
        WebElement signin_link = driver.findElement(By.cssSelector("#signin2"));
        signin_link.click();

        Thread.sleep(1000);
        System.out.println(modalWindow.getCssValue("display"));
        Thread.sleep(1000);

        WebElement randomPlace = driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header > button > span"));

        Thread.sleep(1000);
        randomPlace.click();

        Thread.sleep(1000);
        System.out.println(modalWindow.getCssValue("display"));

        Thread.sleep(1000);
        driver.quit();
    }

}
