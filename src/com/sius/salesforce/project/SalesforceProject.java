package com.sius.salesforce.project;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class SalesforceProject implements ProjectComponent {
    public SalesforceProject(Project project) {
    }

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "SalesforceProject";
    }

    @Override
    public void projectOpened() {
        // called when project is opened
    }

    @Override
    public void projectClosed() {
        // called when project is being closed
    }
}
