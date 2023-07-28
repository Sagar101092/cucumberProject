package com.carsguide.pages;

import com.carsguide.utility.Utility;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDealerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Find a Car Dealership Near You']")
    WebElement findDealerText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']")
    List<WebElement> dealerTitleList;

    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextButton;

    public String findDealerPage() {
        return getTextFromElement(findDealerText);
    }

    public void getDealerName(DataTable dataTable) throws InterruptedException {
        Thread.sleep(1000);
        boolean flag = true;
        SoftAssert softAssert = new SoftAssert();
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> dealer : userList) {
            //  boolean flag = true;
            System.out.println(dealer);
            String numberofpages = getTextFromElement(By.xpath("//div[@class='listing-pagination']//div"));
            String[] number = numberofpages.split(" ");
            String num = number[1];
            int nmofpages = Integer.parseInt(num);

            for (int j = 0; j <= nmofpages; j++) {

                List<WebElement> products1 = driver.findElements(By.xpath("//div[@class='dealerListing--name']"));

                ArrayList<String> arrayList = new ArrayList<>();
                for (WebElement e : products1) {
                    String productname = e.getText();
                    String[] laptopNames = productname.split(",");
                    arrayList.addAll(Arrays.asList(laptopNames[0]));
                }

                for (int i = 0; i < arrayList.size(); i++) {
                    // System.out.println(arrayList.get(i));

                    if (arrayList.get(i).equals(dealer.get(0))) {
                        //  clickOnElement(By.xpath("//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']//h2//a[contains(normalize-space(.), '" + value + "')]"));
                        softAssert.assertTrue(true);
                        // break;
                        flag = false;
                    }
                }
                if (nextButton.isDisplayed()) {
                    clickOnElement(nextButton);
                }
                if (!flag) {
                    break;
                }
            }
            if (flag){
                softAssert.assertTrue(false);
            }

        }
        softAssert.assertAll();
    }
}

//}






