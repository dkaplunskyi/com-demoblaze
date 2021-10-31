package com.demoblaze.Smoke_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Add_item_to_shopping_cart {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void Add_item_to_shopping_cart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);
        Thread.sleep(1000);
        WebElement selectedProduct = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > a > img"));
        System.out.println(selectedProduct.getAttribute("src"));
        String src_befor_selected = selectedProduct.getAttribute("src");
        selectedProduct.click();
        Thread.sleep(1000);
        WebElement addToCart_btn = driver.findElement(By.cssSelector("a[onclick='addToCart(1)']"));
        addToCart_btn.click();
        Thread.sleep(1000);
        String message = driver.switchTo().alert().getText();
        if (message.equals("Product added")) {
            System.out.println("alert message: " + message + ". Test Passed");
        }else{
            System.out.println("Failed");
        }
        driver.switchTo().alert().accept();
        WebElement cart_link = driver.findElement(By.cssSelector("#cartur"));
        cart_link.click();
        Thread.sleep(1000);

        WebElement product_in_cart = driver.findElement(By.cssSelector("#tbodyid > tr > td:nth-child(1) > img"));
        String src_in_cart = product_in_cart.getAttribute("src");

        if (Objects.equals(src_in_cart, src_befor_selected)) {
            System.out.println("Product the same. Test: Passed");
        }else{
            System.out.println("Failed");
        }



        Thread.sleep(1000);
        driver.quit();
    }

}
