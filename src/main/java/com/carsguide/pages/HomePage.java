package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buySell;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCars;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedTab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealerTab;

    public void mouseHoverOnBuyPlusSellTab() {
        log.info("mouse hover on buy+sell tab");
        mouseHoverToElement(buySell);
    }

    public void mouseHoverOnBuyPlusSellTabAndCLickOnSearchCars() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click ‘Search Cars’ link");
        mouseHoverToElementAndClick(searchCars);
    }

    public void mouseHoverOnBuyPlusSellTabAndCLickOnUsedLink() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click ‘Used’ link");
        mouseHoverToElementAndClick(usedTab);
    }

    public void clickOnFindDealer() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick(findDealerTab);
    }


}
