package com.demoblaze.carusel_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageSliderArrows {

    public static String chromedriver = "/Users/dkaplunskyi/IdeaProjects/test_automation_assignment/src/com/demoblaze/chromedriver";
    public static String URL = "https://www.demoblaze.com/index.html";

    public static void sladerArrows_test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromedriver);
        WebDriver driver = new ChromeDriver();

        driver.get(URL);


        WebElement leftArrow = driver.findElement(By.cssSelector("span.carousel-control-prev-icon"));
        WebElement rightArrow = driver.findElement(By.cssSelector("span.carousel-control-next-icon"));

        WebElement firstImg = driver.findElement(By.cssSelector("div.carousel-item.active > img"));
        leftArrow.click();

        Thread.sleep(1000);

        WebElement secondImg = driver.findElement(By.cssSelector("div.carousel-item.active > img"));
        rightArrow.click();

        String imgSrc1 = firstImg.getAttribute("src");
        String imgSrc2 = secondImg.getAttribute("src");

        if (!imgSrc1.equals(imgSrc2)) {
            System.out.println("image change every 5 second test: Passed!");
        } else {
            System.out.println("image change every 5 second test: Failed!");
        }


        Thread.sleep(1000);
        driver.quit();


    }


}
