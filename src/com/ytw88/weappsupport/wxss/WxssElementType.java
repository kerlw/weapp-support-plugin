package com.ytw88.weappsupport.wxss;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class WxssElementType extends IElementType {
    public WxssElementType(@NotNull String debugName) {
        super(debugName, WxssFileType.INSTANCE.getLanguage());
    }
}
