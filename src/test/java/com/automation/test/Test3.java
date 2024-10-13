package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends BaseTest{

    @Test
    public void test3(){
        loginPage.openWebsite();
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
        loginPage.doLogin();

        homePage.addAllItemsToCart();
        Assert.assertTrue(homePage.verifyCartQty());
        homePage.goToCart();

        Assert.assertTrue(cartPage.verifyCartQty());
    }
}
