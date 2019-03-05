package tests;

import common_methods.CommonUseMethodsAndActions;
import org.junit.Assert;
import org.junit.Test;

import static math_task.MathTaskActions.*;

public class CrazyMathTaskTest extends CommonUseMethodsAndActions {

    /**
     * This is Task 4 Test. You can read what's going on easily - just look at the code below.
     * What's important here - you can change/provide any data that you want to test. For more info lurk into one of methods below.
     * Enjoy.
     *
     * @author filipskwierczynski
     */

    @Test
    public void shouldDoCrazyMathTask() {

        //Given
        String productName = "audi"; // Test will search results based on this word - type anything you want here
        int firstPrice = 500; // You can put here any value you want but please remember that this test has its assumptions
        int endPrice = 721;  // You can put here any value you want but please remember that this test has its assumptions

        //When
        openArenaPage();
        searchProductByName(productName);
        checkIfFirstPriceIsLowerThan(firstPrice);
        checkIfFirstProductPriceIsHigherThan(endPrice);
        checkIfPriceIsSupported();

        //Finalize
        Assert.assertTrue(isSupported);
    }
}
