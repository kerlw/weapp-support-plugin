package com.ytw88.weappsupport.wxss;

import com.intellij.lang.Language;

public class WxssLanguage extends Language {
    public static final WxssLanguage INSTANCE = new WxssLanguage();

    private WxssLanguage() {
        super("weapp-wxss");
    }
}
