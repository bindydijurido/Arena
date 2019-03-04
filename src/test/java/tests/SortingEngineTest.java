package tests;

import common_methods.CommonUseMethodsAndActions;
import org.junit.Assert;
import org.junit.Test;

import static sort_engine.SortEngineActions.*;

public class SortingEngineTest extends CommonUseMethodsAndActions {

    /**
     * This is Task 3 Test.
     * What's important here - you can change/provide any data that you want to test. For more info lurk into one of methods below.
     * Enjoy.
     *
     * @author filipskwierczynski
     */

    @Test
    public void shouldSortProductsByPriceAscending() throws InterruptedException {

        //Given
        String productName = "medalion"; // Test will search results based on this word - type anything you want here
        String sortType = "Cena rosnąco"; // You can pick one from sorting methods here - for more info lurk into Test Steps

        //When
        openArenaPage();
        searchProductByName(productName);
        pickFromDropDownMenu(sortType);
        checkPriceAscSortFunctionality();

        //Finalize
        Assert.assertTrue(isOrdered);
        log("Test passed - prices are sorted properly");
    }
}