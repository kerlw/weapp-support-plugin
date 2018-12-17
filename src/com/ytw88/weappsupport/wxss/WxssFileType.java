package com.ytw88.weappsupport.wxss;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import com.ytw88.weappsupport.IconsLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class WxssFileType extends LanguageFileType {
    public static final LanguageFileType INSTANCE = new WxssFileType();
    public static final String DEFAULT_EXTENSION = "wxss";

    private WxssFileType() {
        super(WxssLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Wxss";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Weapp css file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IconsLoader.WXSS_ICON;
    }
}
