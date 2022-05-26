package com.assessment.projects.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage clickCheckout(){
        driver.findElement(By.cssSelector("[name='checkout']")).click();
        return this;
    }

    public String getContinueToShipping(){
        return driver.findElement(By.cssSelector("[type='submit']")).getText();
    }


        //`driver.findElement(By.cssSelector("[name='email']")).click();
        //driver.findElement(By.cssSelector("[aria-labelledby='email-label']")).sendKeys("rikkiw@gmail.com");
        //  WebElement abc;

        //         if (web.size()==0){
        //             abc = driver.findElement(By.id("email"));
        //         } else {
        //             abc= driver.findElement(By.cssSelector("[name='email']")); 
        //         }

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
       
        // driver.findElement(By.cssSelector("#delivery_strategies-SHIPPING")).click();
        // Select select = new Select(driver.findElement(By.cssSelector("[name='countryCode']")));

        // select.selectByVisibleText("Australia");

        // driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("keysToSend");
        // driver.findElement(By.id("TextField38")).sendKeys("keysToSend");


}
