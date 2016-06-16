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

    @Test
    public void testDeleteProject(){
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
        ProjectSettings projectSettings = project.goToProjectSettings();
        projectSettings.deleteProject();
        assertEquals(projectName+" was successfully deleted.", dashboard.getNoticeProjectDeleted());
    }

    @Test
    public void testEditProject(){
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
        ProjectSettings projectSettings = project.goToProjectSettings();
        String newProjectName = "project test";
        String newProjectDescription = "project description";
        projectSettings.setProjectName(newProjectName);
        projectSettings.setProjectDescription(newProjectDescription);
        projectSettings.saveEditProjectSettings();
        assertEquals("Project Test",projectSettings.getHeaderProjectName());
    }
}
