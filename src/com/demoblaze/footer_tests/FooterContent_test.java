package com.demoblaze.footer_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FooterContent_test {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void footerContentExistTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);
        Thread.sleep(1000);

        List<WebElement> footer_elements = driver.findElements(By.cssSelector("#footc div > div > div >div>h4"));

        for (WebElement i : footer_elements) {
            System.out.println(i.getText());
            if (i.getText().contains("About Us") || i.getText().contains("Get in Touch") || i.getText().contains("PRODUCT STORE")) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }

        Thread.sleep(1000);
        driver.quit();

    }


}
