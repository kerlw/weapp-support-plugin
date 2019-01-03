package com.ytw88.weappsupport.wxss;

import com.intellij.psi.css.CssFileElementType;
import com.intellij.psi.tree.IStubFileElementType;
import org.jetbrains.annotations.NotNull;

public class WxssFileElementType extends IStubFileElementType {
    private static final int MY_STUB_VERSION = 3;

    public WxssFileElementType() {
        super("WXSS_FILE", WxssLanguage.INSTANCE);
    }

    @Override
    public int getStubVersion() {
        return super.getStubVersion() + CssFileElementType.BASE_VERSION + MY_STUB_VERSION;
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "wxss.file";
    }
}
