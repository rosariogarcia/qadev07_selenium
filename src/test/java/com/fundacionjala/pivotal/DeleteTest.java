package com.fundacionjala.pivotal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class DeleteTest {
    private  Dashboard dashboard;
    private ProjectMain project;
    private String projectName;
    @Before
    public void setUP(){
        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSignInLink();
        login.setUserNameTextField("walter_mercado_jala");
        login.setPasswordTextField("P@ssw0rd");
        dashboard = login.clickSignInButton();
        dashboard.newProject();
        projectName = "rosario project";
        dashboard.setProjectNameTextField(projectName);
        dashboard.setNewAccountTextField(projectName);
        project = dashboard.clickNewProjectButton();
    }

    @Test
    public void testDeleteProject(){

        ProjectSettings projectSettings = project.goToProjectSettings();
        projectSettings.deleteProject();
        assertEquals(projectName+" was successfully deleted.", dashboard.getNoticeProjectDeleted());
    }

    @Test
    public void testEditProject(){
        ProjectSettings projectSettings = project.goToProjectSettings();
        String newProjectName = "project test";
        String newProjectDescription = "project description";
        projectSettings.setProjectName(newProjectName);
        projectSettings.setProjectDescription(newProjectDescription);
        projectSettings.saveEditProjectSettings();
        assertEquals("Project Test",projectSettings.getHeaderProjectName());
    }

    @After
    public void postCondition(){

       ProjectSettings projectSettings = project.goToProjectSettings();
       projectSettings.deleteProject();
    }
}
