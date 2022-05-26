package com.assessment.projects.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.assessment.projects.model.pages.HomePage;

import org.junit.jupiter.api.Test;


public class CheckoutTest extends BaseTestSuite {

    @Test
    public void verifyCheckOut(){


        var checkout = new HomePage(driver)
            .clickAllCategoriesLink()
            .clickCollectionCategory("Desserts")
            .clickOnProduct("Deep Vanilla Cream Roll")
            .addToCart()
            .clickCartLink()
            .clickCheckout()
            .getContinueToShipping();




        assertEquals("Continue to shipping", checkout);

    }
}
