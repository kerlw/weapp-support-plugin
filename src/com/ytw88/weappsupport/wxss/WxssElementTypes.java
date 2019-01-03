package com.ytw88.weappsupport.wxss;

import com.intellij.psi.css.impl.stubs.CssStylesheetStubElementType;
import com.intellij.psi.css.impl.util.CssStylesheetLazyElementType;
import com.intellij.psi.tree.IFileElementType;

public interface WxssElementTypes {
    IFileElementType WXSS_FILE_TYPE = new WxssFileElementType();

    CssStylesheetLazyElementType WXSS_LAZY_STYLESHEET = new CssStylesheetLazyElementType("WXSS_LAZY_STYLESHEET", WxssLanguage.INSTANCE);
    CssStylesheetStubElementType WXSS_STYLESHEET = new CssStylesheetStubElementType("WXSS_STYLESHEET", WxssLanguage.INSTANCE);
}
