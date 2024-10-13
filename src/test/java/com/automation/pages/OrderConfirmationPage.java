package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

public class OrderConfirmationPage extends BasePage {

    @FindBy(xpath = "//button[@name=\"back-to-products\"]")
    WebElement backHomeBtn;

    public void clickBackHome(){
        backHomeBtn.click();
    }
}
