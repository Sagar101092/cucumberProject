package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewAndUsedCarSearchPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makeElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement modelElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locationElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceElement;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement  findNextCarsElement;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement newAndUsedCarSearchText;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement makesText;



    public void selectMake(String make){
        selectByVisibleTextFromDropDown(makeElement,make);
    }

    public void selectModel(String model){
        selectByVisibleTextFromDropDown(modelElement,model);
    }

    public void selectLocation(String location) {
        selectByVisibleTextFromDropDown(locationElement, location);
    }

    public void selectPrice(String price) {
        selectByVisibleTextFromDropDown(priceElement, price);
    }

    public void clickOnFindNextCarTab(){
        clickOnElement(findNextCarsElement);
    }

    public String getNewAndUsedCarSearchText(){
        return getTextFromElement(newAndUsedCarSearchText);
    }

    public String getMakesText() {
        return getTextFromElement(makesText);
    }
}
