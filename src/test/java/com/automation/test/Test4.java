package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 extends BaseTest{

    @Test
    public void test4() throws InterruptedException {
        loginPage.openWebsite();
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
        loginPage.doLogin();

        homePage.addAllItemsToCart();
        Assert.assertTrue(homePage.verifyCartQty());
        homePage.goToCart();

        cartPage.goToInfoPage();

        infopage.fillInfo();
        infopage.goToCheckout();

        Assert.assertTrue(checkoutPage.checkTotal());
    }
}
