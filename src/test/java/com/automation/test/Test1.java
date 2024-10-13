package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{

    @Test
    public void test1(){
        loginPage.openWebsite();
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
        loginPage.doLogin();

        homePage.sortItemsZtoA();
        Assert.assertTrue(homePage.verifySortedItemsZtoA());
    }

}
