package com.assessment.projects.model.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductPrice(){
        return driver.findElement(By.cssSelector("#ProductPrice")).getText();
    }
    
    public ProductPage addToCart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.cssSelector("#AddToCartText")).click();
        return this;
    }

    public ProductPage clickOnProduct(String productName){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElements(By.tagName("a"))
            .stream()
            .filter(e -> e.getText().equals(productName))
            .findFirst()
            .get()
            .click();

        
        return this;
    }

}
