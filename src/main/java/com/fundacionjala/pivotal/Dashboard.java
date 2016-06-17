package com.fundacionjala.pivotal;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class Dashboard extends BasePage{

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

    @FindBy(id = "notice")
    private WebElement noticeProjectDeleted;

    public String getUserNameText() {
        String userName = "";
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            userName = userNameText.getText();
        }
        catch (NoSuchElementException e){

        }
        finally {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        return userName;
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
        return new ProjectMain();
    }

    public String getNoticeProjectDeleted(){
        return noticeProjectDeleted.getText();
    }
}
