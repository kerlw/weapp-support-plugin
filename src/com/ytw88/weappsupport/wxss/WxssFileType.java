package com.ytw88.weappsupport.wxss;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.css.CssFileType;
import com.ytw88.weappsupport.IconsLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.nio.charset.Charset;

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

    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull byte[] content) {
        Charset charset = CssFileType.getCharsetFromCssContent(content);
        return charset != null ? charset.name() : null;
    }

    @Override
    public Charset extractCharsetFromFileContent(@Nullable Project project, @Nullable VirtualFile file, @NotNull CharSequence content) {
        return CssFileType.getCharsetFromCssContent(content);
    }
}
