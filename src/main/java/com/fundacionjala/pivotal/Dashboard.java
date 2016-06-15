package com.fundacionjala.pivotal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RosarioGarcia on 6/14/2016.
 */
public class Dashboard {
    private WebDriver driver;

    @FindBy(className = "tc_dropdown_name")
    private WebElement userNameText;

    @FindBy(id = "create_new_project_button")
    private WebElement newProjectButton;

    @FindBy(className = "tc_form_input")
    private WebElement projectNameTextField;

    @FindBy(className = "tc_form_select")
    private WebElement accountSelect;

    @FindBy(className = "tc_select_create_account")
    private WebElement newAccountSelectOption;

//    @FindBy(className = "tc_form_input")
    @FindBy(xpath = "html/body/div[2]/div/div/div[2]/div/form/div/section/div[2]/input")
    private WebElement newAccountTextField;

    @FindBy(xpath = "html/body/div[2]/div/div/div[2]/div/form/div/footer/button[2]")
    private WebElement createNewProjectButton;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getUserNameText() {
        return userNameText.getText();
    }

    public void newProject() {
       newProjectButton.click();
    }

    public void setProjectNameTextField(String newProjectName) {
        projectNameTextField.clear();
        projectNameTextField.sendKeys(newProjectName);
    }

    public void setNewAccountTextField(String newAccountName) {
        accountSelect.click();
        newAccountSelectOption.click();
        newAccountTextField.sendKeys(newAccountName);
    }

    public ProjectMain clickNewProjectButton(){
        createNewProjectButton.click();
        return new ProjectMain(driver);
    }

}
