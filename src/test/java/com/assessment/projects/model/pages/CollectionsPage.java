package com.assessment.projects.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CollectionsPage extends ProductPage {

    public CollectionsPage(WebDriver driver){
        super(driver);
    }

    public CollectionsPage clickCollectionCategory(String categoryName ){
        //driver.findElement(By.xpath("//*[@id='shopify-section-list-collections-template']/div/div[4]/div/a")).click();

        driver.findElements(By.tagName("h3"))
            .stream()
            .filter(e -> e.getText().equals(categoryName))
            .findFirst()
            .get()
            .click();
        return this;
    }

    
}
