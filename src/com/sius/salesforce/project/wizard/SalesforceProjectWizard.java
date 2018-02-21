package com.sius.salesforce.project.wizard;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.openapi.module.ModuleComponent;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.jetbrains.annotations.NotNull;

public class SalesforceProjectWizard extends ModuleBuilder {
    public SalesforceProjectWizard(Module module) {
    }

    @Override
    public void setupRootModel(ModifiableRootModel modifiableRootModel) throws ConfigurationException {

    }

    @Override
    public ModuleType getModuleType() {
        return null;
    }
}
