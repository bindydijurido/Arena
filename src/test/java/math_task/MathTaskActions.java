package math_task;

import common_methods.CommonUseMethodsAndActions;

import java.util.stream.Collectors;

public class MathTaskActions extends CommonUseMethodsAndActions {

    private static double firstValue;
    private static double secondValue;
    public static boolean isSupported;

    /**
     * This method specifies a variable which contains First Product Price from Search Result {@link #viewProductNameList()}.
     * Unfortunately, Selenium can read values only in String form, that's why Parsing Methods are used here.
     * Additionally, Product Prices from WebElement contains price unit - that's why I decided to use split here.
     */

    private static final double FIRST_PRODUCT_PRICE = Double.parseDouble(viewProductPriceList()
            .get(0)
            .getText()
            .split(" ")[0]);

    /**
     * This method checks if First Product Price is lower than value (described below).
     *
     * @param value specify the amount of Polish Zloty that you want to compare with {@link #FIRST_PRODUCT_PRICE}. You can provide
     *              anything here but remember that value should be of type Double or Integer.
     *              Depending on the results, this method will print first 5 results in console from {@link #PRODUCT_PRICES} list or not.
     */

    public static void checkIfFirstPriceIsLowerThan(double value) {
        firstValue = value;

        if (FIRST_PRODUCT_PRICE < firstValue) {
            dumpProductPricesToList();
            log("First product price is " + FIRST_PRODUCT_PRICE + " zloty/s and it is lower than "
                    + firstValue + " zloty/s. First 5 prices found in zlotys: "
                    + PRODUCT_PRICES.stream().limit(5).collect(Collectors.toList()));
        } else {
            log("First product price is higher than "
                    + firstValue + " zloty/s. Actually it is: " + FIRST_PRODUCT_PRICE + " zloty/s");
        }
    }

    /**
     * This method checks if First Product Price is higher than value (described below).
     *
     * @param value specify the amount of Polish Zloty that you want to compare with {@link #FIRST_PRODUCT_PRICE}. You can provide
     *              anything here but remember that value should be of type Double or Integer.
     *              Depending on the results, this method will print a difference in console between The Higher and The Lower Prices
     *              found in Search Results in {@link #PRODUCT_PRICES} list.
     */

    public static void checkIfFirstProductPriceIsHigherThan(double value) {
        secondValue = value;

        if (FIRST_PRODUCT_PRICE > secondValue) {
            dumpProductPricesToList();
            log("First product price is higher than " + secondValue + " zloty/s. Difference between higher and lower price is: "
                    + (Double.valueOf(PRODUCT_PRICES.getLast()) - Double.valueOf(PRODUCT_PRICES.getFirst())) + " zloty/s");
        } else {
            log("First product price is lower than "
                    + secondValue + " zloty/s. Actually it is: " + FIRST_PRODUCT_PRICE + " zloty/s");
        }
    }

    /**
     * This method tests if First Product Price is supported by {@link #firstValue} and {@link #secondValue}.
     * If not, test will fail.
     */

    public static void checkIfPriceIsSupported() {
        isSupported = FIRST_PRODUCT_PRICE <= firstValue || FIRST_PRODUCT_PRICE >= secondValue;

        if (isSupported) {
            log("First Price is supported by at least one of entry Values - Test passed");
        } else {
            log("First Price is not supported by any of entry Values - Test failed");
        }
    }
}
