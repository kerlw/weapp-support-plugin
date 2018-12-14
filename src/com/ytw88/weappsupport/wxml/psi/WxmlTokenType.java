package com.ytw88.weappsupport.wxml.psi;

import com.intellij.psi.tree.IElementType;
import com.ytw88.weappsupport.wxml.WxmlLanguage;
import org.jetbrains.annotations.NotNull;

public class WxmlTokenType extends IElementType {
    public WxmlTokenType(@NotNull String debugName) {
        super(debugName, WxmlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "WxmlTokenType." + super.toString();
    }
}
