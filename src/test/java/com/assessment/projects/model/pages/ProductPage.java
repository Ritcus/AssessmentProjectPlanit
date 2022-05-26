package com.assessment.projects.model.pages;

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
        driver.findElement(By.cssSelector("#AddToCartText")).click();
        return this;
    }

    public ProductPage clickOnProduct(String productName){
        driver.findElements(By.tagName("a"))
            .stream()
            .filter(e -> e.getText().equals(productName))
            .findFirst()
            .get()
            .click();

        return this;
    }

}
