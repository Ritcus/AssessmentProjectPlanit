package com.assessment.projects.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public CollectionsPage clickAllCategoriesLink() {
        driver.findElement(By.linkText("All categories")).click();
        return new CollectionsPage(driver);
    }


    public CheckoutPage clickCartLink(){
        driver.findElement(By.cssSelector(".btn--view-cart")).click();
        return new CheckoutPage(driver);

    }

    
}
