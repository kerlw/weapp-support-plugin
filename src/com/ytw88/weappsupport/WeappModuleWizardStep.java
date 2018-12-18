package com.ytw88.weappsupport;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;

public class WeappModuleWizardStep extends ModuleWizardStep {
    @Override
    public JComponent getComponent() {
        return new JLabel("hahahaha");
    }

    @Override
    public void updateDataModel() {
        //todo update model according to UI
    }
}
