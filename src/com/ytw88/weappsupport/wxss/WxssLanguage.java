package com.ytw88.weappsupport.wxss;

import com.intellij.lang.Language;
import com.intellij.lang.css.CSSLanguage;

public class WxssLanguage extends CSSLanguage {
    public static final WxssLanguage INSTANCE = new WxssLanguage();

    private WxssLanguage() {
        super("weapp-wxss");
    }
}
