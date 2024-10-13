package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;


    public void openWebsite(){
        driver.get(ConfigReader.getConfig("application.url"));
    }

    public Boolean isLoginPageDisplayed(){
        return loginButton.isDisplayed();
    }

    public void doLogin(){
        username.sendKeys(ConfigReader.getConfig("login.username"));
        password.sendKeys(ConfigReader.getConfig("login.password"));
        loginButton.click();
    }


}
