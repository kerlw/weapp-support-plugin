package com.ytw88.weappsupport;

import com.intellij.framework.FrameworkTypeEx;
import com.intellij.framework.addSupport.FrameworkSupportInModuleConfigurable;
import com.intellij.framework.addSupport.FrameworkSupportInModuleProvider;
import com.intellij.ide.util.frameworkSupport.FrameworkSupportModel;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ModifiableModelsProvider;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class WeappFramework extends FrameworkTypeEx {
    public static final String FRAMEWORK_ID = "Weapp";

    protected WeappFramework() {
        super(FRAMEWORK_ID);
    }

    @NotNull
    @Override
    public FrameworkSupportInModuleProvider createProvider() {
        return new FrameworkSupportInModuleProvider() {
            @NotNull
            @Override
            public FrameworkTypeEx getFrameworkType() {
                return WeappFramework.this;
            }

            @NotNull
            @Override
            public FrameworkSupportInModuleConfigurable createConfigurable(@NotNull FrameworkSupportModel frameworkSupportModel) {
                return new FrameworkSupportInModuleConfigurable() {
                    @Nullable
                    @Override
                    public JComponent createComponent() {
                        return new JCheckBox("Extra Option");
                    }

                    @Override
                    public void addSupport(@NotNull Module module, @NotNull ModifiableRootModel modifiableRootModel, @NotNull ModifiableModelsProvider modifiableModelsProvider) {
                        //do what you want here: setup a library, generate a specific file, etc
                        //TODO 这里也许可以将weapp的library加入到js library中
                    }
                };
            }

            @Override
            public boolean isEnabledForModuleType(@NotNull ModuleType moduleType) {
                return (moduleType instanceof WeappModuleType);
            }
        };
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "WeApp Framework";
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return IconsLoader.WEAPP_ICON;
    }
}
