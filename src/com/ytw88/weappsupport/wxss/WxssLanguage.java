package com.ytw88.weappsupport.wxss;

import com.intellij.css.util.CssConstants;
import com.intellij.lang.Language;
import com.intellij.lang.css.CSSLanguage;
import com.intellij.lang.css.CssLanguageProperties;
import org.jetbrains.annotations.NotNull;

public class WxssLanguage extends Language implements CssLanguageProperties {
    public static final WxssLanguage INSTANCE = new WxssLanguage();

    private WxssLanguage() {
        super("weapp-wxss");
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Wxss";
    }

    @NotNull
    @Override
    public String getDeclarationsTerminator() {
        return CssConstants.SEMICOLON;
    }

    @Override
    public boolean isIndentBased() {
        return false;
    }
}
