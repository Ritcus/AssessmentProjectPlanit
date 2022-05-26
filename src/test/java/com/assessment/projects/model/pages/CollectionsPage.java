package com.assessment.projects.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CollectionsPage extends ProductPage {

    public CollectionsPage(WebDriver driver){
        super(driver);
    }

    public CollectionsPage clickCollectionCategory(String categoryName ){

        driver.findElements(By.tagName("h3"))            //have other option like to use image alt attibute, but thought using this java function is for user readability on the test page
            .stream()                                               
            .filter(e -> e.getText().equals(categoryName))
            .findFirst()
            .get()
            .click();
        return this;
    }

    
}
