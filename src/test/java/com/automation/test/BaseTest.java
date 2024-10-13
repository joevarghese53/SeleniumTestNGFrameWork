package com.automation.test;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    InfoPage infopage;
    OrderConfirmationPage orderConfirmationPage;

    @BeforeMethod
    public void setUp(){
        DriverManager.createDriver();
        ConfigReader.initConfig();
        loginPage = new LoginPage();
        homePage = new HomePage();
         cartPage = new CartPage();
         checkoutPage = new CheckoutPage();
         infopage = new InfoPage();
         orderConfirmationPage = new OrderConfirmationPage();
    }

    @AfterMethod
    public void cleanup(){
        DriverManager.getDriver().quit();
    }

}
