package sort_engine;

import common_methods.CommonUseMethodsAndActions;
import org.openqa.selenium.By;

class SortEngineLocators extends CommonUseMethodsAndActions {

    static By dropDownMenu() {
        return By.className("vs__selected-options");
    }
}
