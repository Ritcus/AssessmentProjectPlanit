package com.assessment.projects.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class BaseTestSuite {
    protected WebDriver driver;

    @BeforeEach 
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.navigate().to("https://floraindiangroceries.com.au/");
    }

    @AfterEach
    public void closeTest(){
        driver.close();
    }
}
