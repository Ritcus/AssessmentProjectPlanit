package com.assessment.projects.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.assessment.projects.model.pages.SearchPage;

import org.junit.jupiter.api.Test;

public class SearchProductTest extends BaseTestSuite {

    @Test
    public void verifySearchFunction(){

        var searchResultItem = new SearchPage(driver)
            .clickSearchField()
            .setSearchField("Tea")
            .clickSearchIcon()
            .getSearchResult("Wagh Bakri Premium Tea");
            
       
        assertEquals("Wagh Bakri Premium Tea", searchResultItem);

    }
    
}
