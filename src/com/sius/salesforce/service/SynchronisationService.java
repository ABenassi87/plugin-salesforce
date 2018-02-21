package com.sius.salesforce.service;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.sius.salesforce.vfs.FileEventsListener;
import org.jetbrains.annotations.NotNull;

/**
 * @author mark
 */
public class SynchronisationService implements ProjectComponent {

    private final FileEventsListener fileEventsListener;
    private final Project project;

    public SynchronisationService(Project project) {
        this.project = project;
        fileEventsListener = new FileEventsListener(project);
    }

    @Override
    public void projectOpened() {
        // nothing for right now....
    }

    @Override
    public void projectClosed() {
        // nothing for right now
    }

    @Override
    public void initComponent() {
        VirtualFileManager.getInstance().addVirtualFileListener(fileEventsListener);
    }

    @Override
    public void disposeComponent() {
        VirtualFileManager.getInstance().removeVirtualFileListener(fileEventsListener);
    }

    @NotNull
    @Override
    public String getComponentName() {
        return "Synchronization Service";
    }

}
