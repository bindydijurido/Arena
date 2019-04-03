package tests;

import common_methods.CommonUseMethodsAndActions;
import org.junit.Test;
import search_engine.SearchEngineActions;

import static org.junit.Assert.assertTrue;
import static search_engine.SearchEngineActions.*;

public class SearchEngineTest extends CommonUseMethodsAndActions {

    /**
     * This is Task 1 and 2 Test.
     * Important! - check how this test works, especially here:
     * @see SearchEngineActions#checkIfProductPriceIsLessThanQuantity()
     *
     * I assumed that Task 1 is covering Task 2 as well - that's why I decided to merge these two into one test method.
     * If you want to test only Task 1 then just use first two methods in //When section.
     *
     * What's important here - you can change/provide any data that you want to test. For more info lurk into one of methods below.
     * Enjoy.
     *
     * @author filipskwierczynski
     */

    @Test
    public void shouldCompareFirstProductToTotalQuantity() throws InterruptedException {

        //Given
        String productName = "rower"; // Test will search results based on this word - type anything you want here
        int productNumber = 0; // Pick any product you want from the list but please remember about list.size()

        //When
        openArenaPage();
        searchProductByName(productName);
        displayProductName(productNumber);
        displayProductPrice(productNumber);
        displayProductsQuantity();
        checkIfProductPriceIsLessThanQuantity();
        assertResult();

        //Finalize
        assertTrue(isProductPriceHigherThanQuantity);
        log("Test passed - First product price in GROSZ is higher than number of products on all pages");
    }
}
