package com.demoblaze.footer_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterDisplay_test {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void footerDisplayTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);
        Thread.sleep(1000);

        WebElement footer_element = driver.findElement(By.cssSelector("#footc>div"));
        Thread.sleep(1000);

        WebElement product = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(7) > div > div > h4 > a"));
        Thread.sleep(1000);

        System.out.println("Before click product footer status: " + footer_element.isDisplayed());
        Thread.sleep(1000);

        product.click();
        Thread.sleep(1000);
        WebElement footer_element_after_click = driver.findElement(By.cssSelector("#footc>div"));

        System.out.println("After click product footer status: " + footer_element_after_click.isDisplayed());

        Thread.sleep(1000);
        driver.quit();

    }


}
