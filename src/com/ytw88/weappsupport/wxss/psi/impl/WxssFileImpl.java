package com.ytw88.weappsupport.wxss.psi.impl;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.css.impl.StylesheetFileBase;
import com.ytw88.weappsupport.wxss.WxssFileType;
import com.ytw88.weappsupport.wxss.WxssLanguage;
import com.ytw88.weappsupport.wxss.psi.WxssFile;
import org.jetbrains.annotations.NotNull;

public class WxssFileImpl extends StylesheetFileBase implements WxssFile {
    public WxssFileImpl(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, WxssLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return WxssFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Wxss File: " + getName();
    }
}
