package com.ytw88.weappsupport;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class WeappModuleType extends ModuleType<WeappModuleBuilder> {
    public static final String MODULE_ID = "WEAPP_MODULE";

    public static WeappModuleType getInstance() {
        return (WeappModuleType) ModuleTypeManager.getInstance().findByID(MODULE_ID);
    }

    public WeappModuleType() {
        super(MODULE_ID);
    }

    @NotNull
    @Override
    public WeappModuleBuilder createModuleBuilder() {
        return new WeappModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "WeChat App";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Weapp module";
    }

    @Override
    public Icon getNodeIcon(boolean b) {
        return IconsLoader.WEAPP_ICON;
    }

    @NotNull
    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull WeappModuleBuilder moduleBuilder, @NotNull ModulesProvider modulesProvider) {
        return super.createWizardSteps(wizardContext, moduleBuilder, modulesProvider);
    }
}
