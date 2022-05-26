package com.assessment.projects.model.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver){
        super(driver);
    }

    public SearchPage clickSearchField(){
        driver.findElement(By.className("search-bar__input")).click();
        return this;
    }

    public SearchPage clickSearchIcon(){
        driver.findElement(By.className("search-bar__submit")).click();
        return this;
    }

    public SearchPage setSearchField(String keywords){
        driver.findElement(By.className("search-bar__input")).sendKeys(keywords);
        return this;
    }

    public String getSearchResult(String productName){

        return driver.findElements(By.tagName("a"))                       //I found this only way to find the specific item from a search list on search page 
                    .stream()
                    .filter(e -> e.getText().equals(productName))
                    .findFirst()
                    .get()
                    .getText();

    }
    
}
