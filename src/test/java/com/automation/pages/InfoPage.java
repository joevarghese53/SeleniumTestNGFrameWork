package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfoPage extends BasePage{

    @FindBy(xpath = "//input[@name=\"firstName\"]")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@name=\"lastName\"]")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@name=\"postalCode\"]")
    WebElement zipField;

    @FindBy(xpath = "//input[@name=\"continue\"]")
    WebElement continueBtn;

    public void fillInfo(){
        firstNameField.sendKeys(ConfigReader.getConfig("info.firstname"));
        lastNameField.sendKeys(ConfigReader.getConfig("info.lastname"));
        zipField.sendKeys(ConfigReader.getConfig("info.zipcode"));
    }

    public void goToCheckout(){
        continueBtn.click();
    }
}
