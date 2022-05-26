package com.assessment.projects.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.assessment.projects.model.pages.HomePage;


import org.junit.jupiter.api.Test;


public class ProductPriceTest extends BaseTestSuite {

    @Test
    public void verifyPriceDisplay(){
        var productPage = new HomePage(driver)
            .clickAllCategoriesLink()
            .clickCollectionCategory("Biscuits and Rusk")
            .clickOnProduct("Parle Premium Rusk");

        assertEquals("$6.90", productPage.getProductPrice());

    }
    
}
