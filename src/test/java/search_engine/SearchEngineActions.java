package search_engine;

import common_methods.CommonUseMethodsAndActions;

import java.util.concurrent.TimeUnit;

import static search_engine.SearchEngineLocators.*;

public class SearchEngineActions extends CommonUseMethodsAndActions {

    public static boolean isProductPriceHigherThanQuantity = false;
    private static int productsOnFirstPage = 0;

    /**
     * This method displays Product Name in console log. As you can see, Product Name is taken from {@link #viewProductNameList()}.
     *
     * @param productNumber specify which Product Name you want to print out in console. If you want to know list's range -
     *                      try using list.size() on {@link #displayProductsQuantity()} method.
     */

    public static void displayProductName(int productNumber) {
        log("First product name is: " + viewProductNameList().get(productNumber).getText());
    }

    /**
     * This method displays Product Price in console log. As you can see, Product Name is taken from {@link #viewProductPriceList()}.
     *
     * @param productNumber specify which Product Name you want to print out in console. If you want to know list's range -
     *                      try using list.size() on {@link #displayProductsQuantity()} method.
     */

    public static void displayProductPrice(int productNumber) {
        log("First product price is: " + viewProductPriceList().get(productNumber).getText());
    }

    /**
     * This method displays the amount of available products on single results page.
     * {@value #productsOnFirstPage} contains a number of elements/products on a single page. In this test method log will print out
     * the amount of Web Elements just on the First Page but there is no objection to use this method on every results page you want.
     */

    public static void displayProductsQuantity() {
        productsOnFirstPage = viewProductNameList().size();
        log("Found: " + productsOnFirstPage + " products on first page");
    }

    /**
     * This method checks if Product Price in GROSZ is lower than Total Products Found by Selenium Webdriver. What's great here is
     * that you don't have to limit yourself only to firstProductPrice - if you want to test any other product on the list just pick it
     * from the list using .get(). Of course I used parsing and split methods here, because Selenium Webdriver is only getting Text from the whole
     * WebElement. I * 100 to gain value in GROSZ.
     *
     * IMPORTANT! I thought that it will be much more interesting to compare WHOLE products found on EVERY page. I didn't want to limit yourself
     * only to a single page so I decided to compare firstProductPrice in GROSZ with TotalProductsFound.
     * This test builds a list from first result page and the last one. First result page is * available products on single page and
     * then - products from last one page.
     *
     * I know that I understood this task too literally but I couldn't stop myself. ;)
     */

    public static void checkIfProductPriceIsLessThanQuantity() throws InterruptedException {
        int totalPagesFound = Integer.parseInt(let(numberFoundPages()).getText().split(" ")[1]);
        int firstProductPrice = (int) Double
                .parseDouble(viewProductPriceList()
                        .get(0)
                        .getText()
                        .split(" ")[0]) * 100;

        let(paginationInput()).clear();
        let(paginationInput()).sendKeys(String.valueOf(totalPagesFound));
        TimeUnit.SECONDS.sleep(1);

        int totalProductsFound = (totalPagesFound * productsOnFirstPage) - viewProductNameList().size();

        if (firstProductPrice > totalProductsFound) {
            isProductPriceHigherThanQuantity = true;
        }

        log("Found: " + viewProductNameList().size() + " products on last page");
        log("First product price is: " + firstProductPrice + " grosz/y");
        log("Found: " + totalProductsFound + " products in total");
    }

    /**
     * This method assertResults before proper test will finalize its assumptions. Why did I do it? I like to print out in console
     * clear logs in console, a feedback that is easy to read for a developer.
     * jUnit Framework doesn't provide this type of feedback very often. Additionally, {@value #isProductPriceHigherThanQuantity}
     * stores necessary value which is used in jUnit AssertTrue method.
     */

    public static void assertResult() {
        if (isProductPriceHigherThanQuantity) {
            log("First Product Price in GROSZ is higher than Products in Total - Test passed");
        } else {
            log("First Product Price in GROSZ is lower than Products in Total - Test failed");
        }
    }
}
