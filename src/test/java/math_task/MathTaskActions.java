package math_task;

import common_methods.CommonUseMethodsAndActions;

import java.util.stream.Collectors;

public class MathTaskActions extends CommonUseMethodsAndActions {

    private static double firstValue;
    private static double secondValue;
    public static boolean isSupported;

    /**
     * This method specify a variable which contains First Product Price from Search Result {@link #viewProductNameList()}.
     * Unfortunately Selenium can read values only in String form, that's why Parsing Methods are in use here.
     * Additionally Product Prices from WebElement contains price unit - that's why I decided to use split here.
     */

    private static final double FIRST_PRODUCT_PRICE = Double.parseDouble(viewProductPriceList()
            .get(0)
            .getText()
            .split(" ")[0]);

    /**
     * This method is checking if First Product Price is Lower than:
     *
     * @param value specify an amount of Polish Zloty that you want to compare with {@link #FIRST_PRODUCT_PRICE}. You can provide here
     *              anything but remember that value should be double or Integer type.
     *              Depending on the results this method will print on console first 5 results from {@link #PRODUCT_PRICES} list or not
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
     * This method is checking if First Product Price is Higher than:
     *
     * @param value specify an amount of Polish Zloty that you want to compare with {@link #FIRST_PRODUCT_PRICE}. You can provide here
     *              anything but remember that value should be double or Integer type.
     *              Depending on the results this method will print on console difference between The Higher and The Lower Prices
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
     * This method tests if First Product Price is Supported by {@link #firstValue} and {@link #secondValue}.
     * If not Test will fail.
     */

    public static void checkIfPriceIsSupported() {
        isSupported = FIRST_PRODUCT_PRICE <= firstValue || FIRST_PRODUCT_PRICE >= secondValue;

        if (isSupported) {
            log("First Price is supported at least by one of entry Values - Test passed");
        } else {
            log("First Price is not supported by any of entry Values - Test failed");
        }
    }
}
