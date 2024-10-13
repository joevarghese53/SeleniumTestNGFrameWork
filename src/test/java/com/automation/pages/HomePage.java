package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

public class HomePage extends BasePage {

    @FindBy(xpath = "//select[@data-test=\"product-sort-container\"]")
    WebElement sortOption;

    @FindBy(xpath = "//span[@data-test=\"active-option\"]")
    WebElement sortOptionSelected;

    @FindBy(xpath = "//option[@value=\"za\"]")
    WebElement zToa;

    @FindBy(xpath = "//option[@value=\"hilo\"]")
    WebElement priceHtoL;

    @FindBy(xpath = "//button[contains(text(), \"Add to cart\")]")
    List<WebElement> addToCartButtons;

    @FindBy(xpath = "//span[@data-test=\"shopping-cart-badge\"]")
    WebElement cartQty;

    @FindBy(xpath = "//a[@data-test=\"shopping-cart-link\"]")
    WebElement cartIcon;

    @FindBy(xpath = "//button[text()=\"Remove\"]")
    List<WebElement> removeItemBtns;

    public void sortItemsZtoA(){
        sortOption.click();
        zToa.click();
    }

    public void sortItemsHtoL(){
        sortOption.click();
        priceHtoL.click();
    }

    public Boolean verifySortedItemsZtoA(){
        return sortOptionSelected.getText().equals("Name (Z to A)");
    }

    public Boolean verifySortedItemsHtoL(){
        return sortOptionSelected.getText().equals("Price (high to low)");
    }

    public void addAllItemsToCart(){
        for(WebElement button : addToCartButtons){
            button.click();
        }
    }

    public Boolean verifyCartQty(){
        return cartQty.getText().equals("6");
    }

    public void goToCart(){
        cartIcon.click();
    }

    public Boolean checkRemoveBtnNotDisplayed(){
        return removeItemBtns.isEmpty();
    }
}
