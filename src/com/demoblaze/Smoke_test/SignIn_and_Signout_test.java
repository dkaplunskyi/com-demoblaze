package com.demoblaze.Smoke_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn_and_Signout_test {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void signIn_signOut_test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement login_link = driver.findElement(By.cssSelector("#login2"));
        Thread.sleep(500);
        login_link.click();
        Thread.sleep(500);
        WebElement userName = driver.findElement(By.cssSelector("#loginusername"));
        WebElement password = driver.findElement(By.cssSelector("#loginpassword"));
        Thread.sleep(500);
        userName.sendKeys("dk");
        password.sendKeys("q1w2e3");

        WebElement login_btn = driver.findElement(By.cssSelector("button[onclick='logIn()']"));
        Thread.sleep(500);
        login_btn.click();

        Thread.sleep(500);
        WebElement nameOfUser = driver.findElement(By.cssSelector("#nameofuser"));
        Thread.sleep(500);
        System.out.println(nameOfUser.getText());

        if (nameOfUser.getText().contains("Welcome")) {
            System.out.println("Login: Passed");
        } else {
            System.out.println("Login: Failed");
        }


        WebElement logOut_link = driver.findElement(By.cssSelector("#logout2"));
        logOut_link.click();

        Thread.sleep(1000);

        WebElement element = driver.findElement(By.cssSelector("#nameofuser"));
        if (element.isDisplayed()) {
            System.out.println("LogOut Failed");
        }else {
            System.out.println("LogOut Passed");
        }

        Thread.sleep(1000);
        driver.quit();
    }

}
