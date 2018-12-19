package com.ytw88.weappsupport.wxml;

import com.intellij.ide.highlighter.HtmlFileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.ytw88.weappsupport.IconsLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;


public class WxmlFileType extends LanguageFileType {
    public static final LanguageFileType INSTANCE = new WxmlFileType();
    public static final String DEFAULT_EXTENSION = "wxml";

    private WxmlFileType() {
        super(WxmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Wxml";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Weapp xml file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IconsLoader.WXML_ICON;
    }
}
