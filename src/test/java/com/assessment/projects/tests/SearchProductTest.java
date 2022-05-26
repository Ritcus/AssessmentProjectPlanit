package com.assessment.projects.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.assessment.projects.model.pages.SearchPage;

import org.junit.jupiter.api.Test;

public class SearchProductTest extends BaseTestSuite {

    @Test
    public void verifySearchFunction(){

        var searchKeyword = "Tea";

        var searchPage = new SearchPage(driver)
            .clickSearchField()
            .setSearchField(searchKeyword)
            .clickSearchIcon()
            .getSearchResult();
            
       
        assertEquals("Wagh Bakri Premium Tea", searchPage);

    }
    
}
