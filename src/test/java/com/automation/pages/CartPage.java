package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//div[@data-test=\"inventory-item\"]")
    List<WebElement> cartItems;

    @FindBy(xpath = "//span[@data-test=\"shopping-cart-badge\"]")
    WebElement cartQty;

    @FindBy(xpath = "//button[text()=\"Checkout\"]")
    WebElement checkoutBtn;

    public Boolean verifyCartQty(){
        return cartQty.getText().equals(String.valueOf(cartItems.size()));
    }

    public void goToInfoPage(){
        checkoutBtn.click();
    }
}
