package com.demoblaze.contact_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactLinkVideoWindowDisplayTest {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void contactLinkTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement contactLink = driver.findElement(By.cssSelector("a[data-target='#exampleModal']"));
        contactLink.click();
        Thread.sleep(500);

        WebElement contactWindowElement = driver.findElement(By.cssSelector("#exampleModalLabel"));
        if (contactWindowElement.isDisplayed()) {
            System.out.println("contact test: Passed");
        }else {
            System.out.println("contact test: Failed");
        }


        Thread.sleep(1000);
        driver.quit();
    }

}
