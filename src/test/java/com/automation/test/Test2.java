package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseTest{

    @Test
    public void test2(){
        loginPage.openWebsite();
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
        loginPage.doLogin();

        homePage.sortItemsHtoL();
        Assert.assertTrue(homePage.verifySortedItemsHtoL());
    }
}
