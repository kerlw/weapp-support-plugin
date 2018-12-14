package com.ytw88.weappsupport.wxml.psi;

import com.intellij.psi.tree.IElementType;
import com.ytw88.weappsupport.wxml.WxmlLanguage;
import org.jetbrains.annotations.NotNull;

public class WxmlElementType extends IElementType {
    public WxmlElementType(@NotNull String debugName) {
        super(debugName, WxmlLanguage.INSTANCE);
    }
}
