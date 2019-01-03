package com.ytw88.weappsupport.wxss.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.psi.css.impl.parsing.CssParser2;
import com.intellij.psi.css.impl.stubs.CssStylesheetStubElementType;
import com.intellij.psi.css.impl.util.CssStylesheetLazyElementType;
import com.intellij.psi.tree.IElementType;
import com.ytw88.weappsupport.wxss.WxssElementTypes;
import org.jetbrains.annotations.NotNull;

public class WxssParser extends CssParser2 {
    @Override
    protected CssStylesheetLazyElementType getStylesheetLazyElementType() {
        return WxssElementTypes.WXSS_LAZY_STYLESHEET;
    }

    @Override
    protected CssStylesheetStubElementType getStylesheetElementType() {
        return WxssElementTypes.WXSS_STYLESHEET;
    }

    @Override
    protected boolean parseSingleDeclarationInBlock(boolean withPageMarginRules, boolean parseInlineCss,
                                                    boolean requirePropertyValue, @NotNull IElementType elementType) {

        return super.parseSingleDeclarationInBlock(withPageMarginRules, parseInlineCss, requirePropertyValue, elementType);
    }

    @NotNull
    @Override
    public ASTNode parse(@NotNull IElementType root, @NotNull PsiBuilder builder) {
        return super.parse(root, builder);
    }

    @Override
    public ASTNode parse(IElementType root) {
        return super.parse(root);
    }

    @Override
    protected boolean parseStylesheetItem() {
        return super.parseStylesheetItem();
    }
}
