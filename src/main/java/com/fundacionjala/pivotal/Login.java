package com.fundacionjala.pivotal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RosarioGarcia on 6/14/2016.
 */
public class Login extends BasePage{

    private WebDriver driver;

    @FindBy(id = "credentials_username")
    private WebElement userNameTextField;

    @FindBy(id = "credentials_password")
    private WebElement passwordTextField;

    @FindBy(className = "app_signup_submit_button_button")
    private WebElement sigInButton;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserNameTextField(String userName) {
        userNameTextField.clear();
        userNameTextField.sendKeys(userName);
    }

    public void setPasswordTextField(String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public Dashboard clickSignInButton() {
        sigInButton.click();
        return new Dashboard(driver);
    }


}
