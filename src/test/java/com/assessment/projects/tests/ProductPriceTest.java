package com.assessment.projects.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.assessment.projects.model.pages.HomePage;


import org.junit.jupiter.api.Test;


public class ProductPriceTest extends BaseTestSuite {

    @Test
    public void verifyPriceDisplay(){
        var productPage = new HomePage(driver)
            .clickAllCategoriesLink()
            .clickCollectionCategory("Desserts")
            .clickOnProduct("Deep Vanilla Cream Roll")
            .getProductPrice();

        assertEquals("$4.90", productPage);

    }
    
}
