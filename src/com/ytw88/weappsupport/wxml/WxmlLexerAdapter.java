package com.ytw88.weappsupport.wxml;

import com.intellij.lexer.FlexAdapter;
import com.ytw88.weappsupport.wxml.grammer.WxmlLexer;

import java.io.Reader;

public class WxmlLexerAdapter extends FlexAdapter {
    public WxmlLexerAdapter() {
        super(new WxmlLexer((Reader) null));
    }
}
