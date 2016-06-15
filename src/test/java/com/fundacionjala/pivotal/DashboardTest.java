package com.fundacionjala.pivotal;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class DashboardTest {

    @Test
    public void testNewProject(){
        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSignInLink();
        login.setUserNameTextField("walter_mercado_jala");
        login.setPasswordTextField("P@ssw0rd");
        Dashboard dashboard = login.clickSignInButton();
        dashboard.newProject();
        String projectName = "rosario project";
        dashboard.setProjectNameTextField(projectName);
        dashboard.setNewAccountTextField(projectName);
        ProjectMain project = dashboard.clickNewProjectButton();
        assertEquals("Rosario Project", project.getProjectNameText());
    }
}
