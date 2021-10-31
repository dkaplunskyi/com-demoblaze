package com.demoblaze.contact_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactSendEmptyMessage_tests {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void sendMessageTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement contactLink = driver.findElement(By.cssSelector("a[data-target='#exampleModal']"));
        contactLink.click();
        Thread.sleep(500);

        WebElement contactEmail_field = driver.findElement(By.cssSelector("#recipient-email"));
//        contactEmail_field.sendKeys("qwerty@gmail.com");

        WebElement contactName_field = driver.findElement(By.cssSelector("#recipient-name"));
//        contactName_field.sendKeys("julia");

        WebElement message_field = driver.findElement(By.cssSelector("#message-text"));
//        message_field.sendKeys("Hello! I'm Julia!");
//        Thread.sleep(1000);

        WebElement sendMessage_btn = driver.findElement(By.cssSelector("button[onclick='send()']"));
        sendMessage_btn.click();
//        Thread.sleep(1000);

        String alertMessage = driver.switchTo().alert().getText();

        if (!alertMessage.contains("Thanks for the message")) {
            System.out.println("send empty message test: Passed");
        }else{
            System.out.println("send empty message test: Failed");
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
