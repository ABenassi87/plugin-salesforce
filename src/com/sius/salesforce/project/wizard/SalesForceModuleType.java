package com.sius.salesforce.project.wizard;

import com.intellij.openapi.module.ModuleType;
import com.sius.salesforce.sdk.SalesForceSdkType;
import com.intellij.icons.AllIcons;
import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.SettingsStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.sius.salesforce.view.wizard.SalesForceInstanceSelectionStep;
import com.sius.salesforce.view.wizard.SalesForceSynchroniseOptionsStep;
import com.sius.salesforce.view.wizard.SalesForceSynchroniseStep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;

/**
 * A ModuleType for a Salesforce module
 *
 * @author mark
 */
public class SalesForceModuleType extends ModuleType<SalesForceModuleBuilder> {

    public SalesForceModuleType() {
        super("SALESFORCE_MODULE");
    }

    @Override
    @NotNull
    public SalesForceModuleBuilder createModuleBuilder() {
        return new SalesForceModuleBuilder();
    }

    @Override
    @NotNull
    public String getName() {
        return "Salesforce Module";
    }

    @Override
    @NotNull
    public String getDescription() {
        return "Creates an empty SalesForce module.";
    }

    /*@Override
    public Icon getBigIcon() {
        return AllIcons.Modules.Types.JavaModule;
    }*/

    @Override
    public Icon getNodeIcon(@Deprecated boolean b) {
        return AllIcons.Nodes.Module;
    }

    @Override
    public boolean isValidSdk(@NotNull final Module module, @Nullable final Sdk projectSdk) {
        return projectSdk != null && projectSdk.getSdkType() instanceof SalesForceSdkType;
    }

    @Override
    @NotNull
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull SalesForceModuleBuilder moduleBuilder, @NotNull ModulesProvider modulesProvider) {
        ArrayList<ModuleWizardStep> steps = new ArrayList<ModuleWizardStep>();
        steps.add(new SalesForceInstanceSelectionStep(wizardContext.getProject(), moduleBuilder.getStateBean()));
        steps.add(new SalesForceSynchroniseOptionsStep(moduleBuilder.getStateBean()));
        steps.add(new SalesForceSynchroniseStep(moduleBuilder.getStateBean(), moduleBuilder));
        return steps.toArray(new ModuleWizardStep[steps.size()]);
    }

    @Nullable
    @Override
    public ModuleWizardStep modifySettingsStep(@NotNull SettingsStep settingsStep, @NotNull ModuleBuilder moduleBuilder) {
        return null;
    }
}
