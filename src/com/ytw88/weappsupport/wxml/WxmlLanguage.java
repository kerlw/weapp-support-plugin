package com.ytw88.weappsupport.wxml;

import com.intellij.lang.Language;

public class WxmlLanguage extends Language {

    public static final WxmlLanguage INSTANCE = new WxmlLanguage();

    private WxmlLanguage() {
        super("weapp-wxml");
    }
}
