package com.ytw88.weappsupport.wxml.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.ytw88.weappsupport.IconsLoader;
import com.ytw88.weappsupport.wxml.WxmlFileType;
import com.ytw88.weappsupport.wxml.WxmlLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class WxmlFile extends PsiFileBase {
    public WxmlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, WxmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return WxmlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Wxml File";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return IconsLoader.WXML_ICON;
    }
}
