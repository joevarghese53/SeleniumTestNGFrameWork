package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage extends BasePage{

    @FindBy(xpath = "//div[@data-test=\"inventory-item-price\"]")
    List<WebElement> itemPrices;

    @FindBy(xpath = "//div[@data-test=\"tax-label\"]")
    WebElement taxPrice;

    @FindBy(xpath = "//div[@data-test=\"total-label\"]")
    WebElement totalPriceDisplayed;

    @FindBy(xpath = "//button[@name=\"finish\"]")
    WebElement finishButton;

    double total = 0, totalPriceDisplayedDouble;

    public Boolean checkTotal(){
        for (WebElement price : itemPrices){
            total += Double.parseDouble(price.getText().replace("$",""));
        }
        total += Double.parseDouble(taxPrice.getText().replace("Tax: $",""));
        totalPriceDisplayedDouble = Double.parseDouble(totalPriceDisplayed.getText().replace("Total: $",""));
        return total == totalPriceDisplayedDouble;
    }

    public void clickFinish(){
        finishButton.click();
    }
}
