package com.demoblaze.cart_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartDisplayVarification {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void cartVerification() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement cart_link = driver.findElement(By.cssSelector("#cartur"));
        cart_link.click();
        Thread.sleep(1000);
        WebElement cart_element = driver.findElement(By.cssSelector("#page-wrapper"));

        if (cart_element.isDisplayed()) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        Thread.sleep(1000);
        driver.quit();
    }

}
