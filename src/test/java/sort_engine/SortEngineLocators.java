package sort_engine;

import common_methods.CommonUseMethodsAndActions;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.className;

class SortEngineLocators extends CommonUseMethodsAndActions {

    static By dropDownMenu() { return className("vs__selected-options");
    }
}
