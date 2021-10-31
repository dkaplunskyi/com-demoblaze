package com.demoblaze.aboutsUs_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutUsLinkTest {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void aboutUsLinkTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement aboutUsLink = driver.findElement(By.cssSelector("a[data-target='#videoModal']"));
        aboutUsLink.click();
        Thread.sleep(500);
        WebElement play_btn = driver.findElement(By.cssSelector("button[title='Play Video']"));
        play_btn.click();

        WebElement contactWindowElement = driver.findElement(By.cssSelector("a[data-target='#exampleModal']"));
        if (contactWindowElement.isDisplayed()) {
            System.out.println("TC#1: Passed");
        }else {
            System.out.println("TC#1: Failed");
        }

        Thread.sleep(3000);
        driver.quit();
    }

}
