package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UsedCarPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
    WebElement usedCarText;

    public String getUsedCarForSaleText() {
        return getTextFromElement(usedCarText);
    }


}
