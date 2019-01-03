package com.ytw88.weappsupport.wxss.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.css.CSSParserDefinition;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.ytw88.weappsupport.wxss.WxssElementTypes;
import com.ytw88.weappsupport.wxss.psi.impl.WxssFileImpl;
import org.jetbrains.annotations.NotNull;

public class WxssParserDefinition extends CSSParserDefinition {

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new WxssFileImpl(viewProvider);
    }

    @Override
    public IFileElementType getFileNodeType() {
        return WxssElementTypes.WXSS_FILE_TYPE;
    }

    @NotNull
    @Override
    public PsiParser createParser(Project project) {
        return new WxssParser();
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        System.out.println(node.toString());
        PsiElement ret = super.createElement(node);
        return ret;
    }
}
